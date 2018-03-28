package com.liumapp.demo.tdd.engine.model.service;

import com.liumapp.demo.tdd.engine.model.domain.Order;

/**
 * @author liumapp
 * @file OrderService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
public interface OrderService {

    public Long createOrder (Order order);

    public Order getOrderById (Long orderId);

}
