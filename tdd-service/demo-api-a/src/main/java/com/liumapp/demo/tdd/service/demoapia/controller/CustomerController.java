package com.liumapp.demo.tdd.service.demoapia.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.tdd.engine.model.domain.Customer;
import com.liumapp.demo.tdd.engine.model.service.CustomerService;
import com.liumapp.demo.tdd.engine.toola.entity.ResEntity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "这是简要的说明",
            notes = "这是详细的说明，name代表消费者的姓名，sex代表性别，添加时不需要加id")
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
