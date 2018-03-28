package com.liumapp.demo.tdd.engine.model.service.impl;

import com.liumapp.demo.tdd.engine.model.domain.Order;
import com.liumapp.demo.tdd.engine.model.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file OrderServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Override
    public Long createOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrderById(Long orderId) {
        return null;
    }

}
