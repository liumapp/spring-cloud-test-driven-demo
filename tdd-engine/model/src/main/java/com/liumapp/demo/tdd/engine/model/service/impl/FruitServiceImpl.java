package com.liumapp.demo.tdd.engine.model.service.impl;

import com.liumapp.demo.tdd.engine.model.domain.Fruit;
import com.liumapp.demo.tdd.engine.model.service.FruitService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file FruitServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@Service
@Transactional
public class FruitServiceImpl implements FruitService {

    @Override
    public Long createFruit(Fruit fruit) {
        return null;
    }

    @Override
    public Fruit getFruitById(Long fruitId) {
        return null;
    }

}
