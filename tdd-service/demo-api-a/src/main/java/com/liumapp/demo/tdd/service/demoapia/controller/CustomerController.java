package com.liumapp.demo.tdd.service.demoapia.controller;

import com.liumapp.demo.tdd.engine.model.domain.Customer;
import com.liumapp.demo.tdd.engine.model.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/create",
            method = RequestMethod.POST,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a customer.",
            notes = "Return success info")
    public String createCustomer (@RequestBody Customer customer) {
        Long customerId = customerService.createCustomer(customer);
        return "create user done , new userId is : " + customerId;
    }

    @RequestMapping("/get")
    public ResponseEntity<?> getCustomer () {
        return ResponseEntity.ok("select customer info , detail is : ");
    }

}
