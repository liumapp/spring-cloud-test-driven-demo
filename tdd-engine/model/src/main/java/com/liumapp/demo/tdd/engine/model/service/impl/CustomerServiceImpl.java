package com.liumapp.demo.tdd.engine.model.service.impl;

import com.liumapp.demo.tdd.engine.model.domain.Customer;
import com.liumapp.demo.tdd.engine.model.mapper.CustomerMapper;
import com.liumapp.demo.tdd.engine.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file CustomerServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Long createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return null;
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

}
