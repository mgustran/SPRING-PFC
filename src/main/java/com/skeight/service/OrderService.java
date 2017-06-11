package com.skeight.service;

import com.skeight.dao.IOrderDAO;
import com.skeight.entity.Order;
import com.skeight.entity.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mgustran on 11/06/2017.
 */

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderDAO orderDAO;
    @Override
    public Order getOrderById(int orderId) {
        Order obj = orderDAO.getOrderById(orderId);
        return obj;
    }
    @Override
    public List<Order> getAllOrders(){
        return orderDAO.getAllOrders();
    }
    @Override
    public synchronized boolean addOrder(Order order){
        orderDAO.addOrder(order);
        return true;
    }
    @Override
    public void updateOrder(Order order) {
        orderDAO.updateOrder(order);
    }
    @Override
    public void deleteOrder(int orderId) {
        orderDAO.deleteOrder(orderId);
    }
}
