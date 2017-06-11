package com.skeight.service;

import com.skeight.entity.Order;

import java.util.List;

/**
 * Created by mgustran on 11/06/2017.
 */
public interface IOrderService {
    List<Order> getAllOrders();
    Order getOrderById(int orderId);
    boolean addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
}
