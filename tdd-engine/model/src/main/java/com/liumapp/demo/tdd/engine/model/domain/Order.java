package com.liumapp.demo.tdd.engine.model.domain;

import java.math.BigDecimal;

public class Order {
    private Long id;

    private Long customerid;

    private Long fruitid;

    private String weight;

    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Long getFruitid() {
        return fruitid;
    }

    public void setFruitid(Long fruitid) {
        this.fruitid = fruitid;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}