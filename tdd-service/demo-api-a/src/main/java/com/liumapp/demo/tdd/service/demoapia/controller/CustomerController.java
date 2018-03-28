package com.liumapp.demo.tdd.service.demoapia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public ResponseEntity<?> createCustomer () {
        return ResponseEntity.ok("create user done , new user is : " );
    }

    public ResponseEntity<?> getCustomer () {
        return ResponseEntity.ok("select customer info , detail is : ");
    }

}
