package com.skeight.controller;

import com.skeight.entity.Order;
import com.skeight.entity.Spot;
import com.skeight.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by mgustran on 11/06/2017.
 */

@Controller
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;
    @GetMapping("order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") Integer id) {
        Order order = orderService.getOrderById(id);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }
    @GetMapping("orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> list = orderService.getAllOrders();
        return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
    }
    @PostMapping("order")
    public ResponseEntity<Void> addOrder(@RequestBody Order order, UriComponentsBuilder builder) {
        boolean flag = orderService.addOrder(order);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/order/{id}").buildAndExpand(order.getOrderId()).toUri());
        headers.add("Access-Control-Allow-Methods", "GET, OPTIONS, POST, HEAD");
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PutMapping("order")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }
    @DeleteMapping("order/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Integer id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}