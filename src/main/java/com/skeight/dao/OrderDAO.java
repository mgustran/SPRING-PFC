package com.skeight.dao;

import com.skeight.entity.Order;
import com.skeight.entity.Spot;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mgustran on 11/06/2017.
 */

@Transactional
@Repository
public class OrderDAO implements IOrderDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Order getOrderById(int orderId) {
        return entityManager.find(Order.class, orderId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> getAllOrders() {
        String hql = "FROM Order as ordr ORDER BY ordr.orderId";
        return (List<Order>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addOrder(Order order) {
        entityManager.persist(order);
    }

    @Override
    public void updateOrder(Order order) {
        Order ordr = getOrderById(order.getOrderId());
        ordr.setName(order.getName());
        ordr.setSecondName(order.getSecondName());
        ordr.setEmail(order.getEmail());
        ordr.setCcard(order.getCcard());
        ordr.setCvc(order.getCvc());
        ordr.setMonthCard(order.getMonthCard());
        order.setYearCard(order.getYearCard());
        ordr.setAddress(order.getAddress());
        ordr.setLocation(order.getLocation());
        ordr.setCountry(order.getCountry());
        ordr.setPostalCode(order.getPostalCode());
        ordr.setQuantities(order.getQuantities());
        ordr.setTotalPrice(order.getTotalPrice());
        ordr.setTotalTax(order.getTotalTax());
        entityManager.flush();
    }

    @Override
    public void deleteOrder (int orderId) {
        entityManager.remove(getOrderById(orderId));
    }
}
