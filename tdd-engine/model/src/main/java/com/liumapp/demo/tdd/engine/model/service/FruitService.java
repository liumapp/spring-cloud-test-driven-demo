package com.liumapp.demo.tdd.engine.model.service;

import com.liumapp.demo.tdd.engine.model.domain.Fruit;

import java.util.List;

/**
 * @author liumapp
 * @file FruitService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
public interface FruitService {

    public Long createFruit (Fruit fruit);

    public Fruit getFruitById (Long fruitId);

    public List<Fruit> getFruitList ();

}
