package com.liumapp.demo.tdd.service.demoapia.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.tdd.engine.model.domain.Fruit;
import com.liumapp.demo.tdd.engine.model.service.FruitService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author liumapp
 * @file FruitController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@RestController
@RequestMapping("fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @RequestMapping(value = "/add",
                method = RequestMethod.POST,
                produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "create a new fruit",
                notes = "accept fruit params , and create new fruit")
    public String createFruit (@RequestBody Fruit fruit) {
        return JSON.toJSONString("add fruit success , and fruit id is : " + fruitService.createFruit(fruit));
    }

    @RequestMapping(value = "/get/{id}",
                method = RequestMethod.GET,
                produces = {"application/json"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "get a fruit detail",
                notes = "accept fruit detail , by fruit id")
    public String getFruit (@ApiParam(value = "the ID of fruit" , required = true) @PathVariable("id") Long id) {
        return JSON.toJSONString(fruitService.getFruitById(id));
    }

}
