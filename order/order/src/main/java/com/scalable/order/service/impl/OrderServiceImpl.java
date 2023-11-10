package com.scalable.order.service.impl;

import com.scalable.order.entity.Order;
import com.scalable.order.repository.OrderRepository;
import com.scalable.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        order.setOrderTime(System.currentTimeMillis());
        order.setOrderGuid(String.valueOf(UUID.randomUUID()));
        order.setOrderStatus("CREATED");
        order.setPaymentId(null);
        order.setTotalPrice(order.getItemPrice() * order.getQuantity());
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderRepository.findById(Long.valueOf(orderId))
                .orElse(null);

    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order order, String orderId) {
        Order existingOrder = orderRepository.findById(Long.valueOf(orderId))
                .orElse(null);
        if (existingOrder != null) {
            existingOrder.setPaymentId(order.getPaymentId());
            existingOrder.setOrderStatus(order.getOrderStatus());
            existingOrder.setDeliveryTime(order.getOrderTime()+60000);
            return  orderRepository.save(existingOrder);
        }
        else {
            return null;
        }
    }
}
