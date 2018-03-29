package com.liumapp.demo.tdd.service.demoapia.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.tdd.engine.model.domain.Order;
import com.liumapp.demo.tdd.engine.model.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author liumapp
 * @file OrderController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add",
                method = RequestMethod.POST,
                produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "add order",
            notes = "add order by Order params")
    public String createOrder (@RequestBody Order order) {
        return JSON.toJSONString("add order success , and order id is : " + orderService.createOrder(order));
    }

    @RequestMapping(value = "/get/{id}",
                method = RequestMethod.GET,
                produces = {"application/json"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "get order detail",
                notes = "get order detail according to orderId , this will also included customer and fruit detail")
    public String getOrder (@ApiParam(value = "the id of order",required = true) @PathVariable("id") Long id) {
        
        return "success";
    }



}
