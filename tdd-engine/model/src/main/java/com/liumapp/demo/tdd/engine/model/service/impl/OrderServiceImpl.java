package com.liumapp.demo.tdd.engine.model.service.impl;

import com.liumapp.demo.tdd.engine.model.domain.Order;
import com.liumapp.demo.tdd.engine.model.entity.FullOrder;
import com.liumapp.demo.tdd.engine.model.mapper.CustomerMapper;
import com.liumapp.demo.tdd.engine.model.mapper.FruitMapper;
import com.liumapp.demo.tdd.engine.model.mapper.OrderMapper;
import com.liumapp.demo.tdd.engine.model.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public Long createOrder(Order order) {
        orderMapper.insert(order);
        return order.getId();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public FullOrder getFullOrder(Long orderId) {
        FullOrder fullOrder = new FullOrder();
        fullOrder.setOrder(orderMapper.selectByPrimaryKey(orderId));
        fullOrder.setCustomer(customerMapper.selectByPrimaryKey(
                fullOrder.getOrder().getCustomerid()
        ));
        fullOrder.setFruit(fruitMapper.selectByPrimaryKey(
                fullOrder.getOrder().getFruitid()
        ));
        return fullOrder;
    }

}
