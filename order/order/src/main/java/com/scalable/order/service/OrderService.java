package com.scalable.order.service;

import com.scalable.order.entity.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    Order getOrderById(String orderId);

    List<Order> getAllOrders();

    Order updateOrder(Order order, String orderId);
}

