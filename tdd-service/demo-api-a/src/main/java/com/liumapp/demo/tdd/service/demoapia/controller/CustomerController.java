package com.liumapp.demo.tdd.service.demoapia.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.tdd.engine.model.domain.Customer;
import com.liumapp.demo.tdd.engine.model.service.CustomerService;
import com.liumapp.demo.tdd.engine.toola.entity.ResEntity;
import com.liumapp.demo.tdd.engine.toola.exception.ResourceNotFoundException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author liumapp
 * @file CustomerController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@RestController
@RequestMapping("customer")
public class CustomerController extends ApiHandler {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ResEntity resEntity;

    @RequestMapping(value = "/create",
            method = RequestMethod.POST,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a customer.",
            notes = "Return success info")
    public String createCustomer (@RequestBody Customer customer) {
        Long customerId = customerService.createCustomer(customer);
        resEntity.setCode(200);
        resEntity.setMsg("create user done");
        resEntity.setContent(customerId.toString());
        return JSON.toJSONString(resEntity);
    }

    @RequestMapping(value = "/get/{id}",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "get a customer detail info",
            notes = "return a customer detail by id")
    public String getCustomer (@ApiParam(value = "The ID of the customer.", required = true)
                                              @PathVariable("id") Long id) throws Exception {
        Customer customer = customerService.getCustomerById(id);
        checkResourceFound(customer);
        return JSON.toJSONString(customer);
    }

    @RequestMapping(value = "/delete/{id}",
                method = RequestMethod.GET,
                produces = {"application/json"})
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "del a customer",
            notes = "del a customer according to customer id")
    public String delCustomer (@ApiParam(value = "The id of the customer.",required = true)
                                                @PathVariable("id") Long id) {
        String result = "delete failed";
        if (customerService.deleteCustomerById(id))
            result = "delete success";
        return JSON.toJSONString(result);
    }

}
