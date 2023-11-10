package com.scalable.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;



@Entity
@Table(name = "order_details", schema = "orders")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="restaurant_id")
    private String restaurantId;
    @Column(name="item")
    private String item;
    @Column(name="item_price")
    private int itemPrice;
    @Column(name="quantity")
    private int quantity;
    @Column(name="order_status")
    private String orderStatus;
    @Column(name="order_guid")
    private String orderGuid;
    @Column(name="total_price")
    private int totalPrice;
    @Column(name="order_time")
    private long orderTime;
    @Column(name="special_note")
    private String specialNote;
    @Column(name="delivery_time")
    private long deliveryTime;
    @Column(name="payment_id")
    private String paymentId;
    @Column(name="note")
    private String note;

    public Order() {

    }


    public Order(String restaurantId, String item, int itemPrice, int quantity, String orderStatus, String orderGuid, int totalPrice, long orderTime, String specialNote, long deliveryTime, String paymentId, String note) {
        this.restaurantId = restaurantId;
        this.item = item;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
        this.orderGuid = orderGuid;
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
        this.specialNote = specialNote;
        this.deliveryTime = deliveryTime;
        this.paymentId = paymentId;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getItems() {
        return item;
    }

    public void setItems(String items) {
        this.item = items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(long orderTime) {
        this.orderTime = orderTime;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }

    public long getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderGuid() {
        return orderGuid;
    }

    public void setOrderGuid(String orderGuid) {
        this.orderGuid = orderGuid;
    }


}
