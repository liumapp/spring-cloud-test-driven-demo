package com.liumapp.demo.tdd.engine.model.service.impl;

import com.liumapp.demo.tdd.engine.model.domain.Fruit;
import com.liumapp.demo.tdd.engine.model.mapper.FruitMapper;
import com.liumapp.demo.tdd.engine.model.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public Long createFruit(Fruit fruit) {
        fruitMapper.insert(fruit);
        return fruit.getId();
    }

    @Override
    public Fruit getFruitById(Long fruitId) {
        return fruitMapper.selectByPrimaryKey(fruitId);
    }

}
