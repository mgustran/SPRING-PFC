package com.skeight.dao;

import com.skeight.entity.Order;
import java.util.List;

/**
 * Created by mgustran on 11/06/2017.
 */

public interface IOrderDAO {
    List<Order> getAllOrders();
    Order getOrderById(int orderId);
    void addOrder(Order order);
    void updateOrder(Order order);
    void deleteOrder(int orderId);
}
