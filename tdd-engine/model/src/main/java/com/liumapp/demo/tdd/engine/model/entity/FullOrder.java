package com.liumapp.demo.tdd.engine.model.entity;


import com.liumapp.demo.tdd.engine.model.domain.Customer;
import com.liumapp.demo.tdd.engine.model.domain.Fruit;
import com.liumapp.demo.tdd.engine.model.domain.Order;

import java.io.Serializable;

/**
 * @author liumapp
 * @file FullOrder.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
public class FullOrder implements Serializable {

    protected Order order;

    protected Customer customer;

    protected Fruit fruit;

    public FullOrder() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "FullOrder{" +
                "order=" + order +
                ", customer=" + customer +
                ", fruit=" + fruit +
                '}';
    }
}
