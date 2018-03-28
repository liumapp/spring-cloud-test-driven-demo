package com.liumapp.demo.tdd.engine.model.service;

import com.liumapp.demo.tdd.engine.model.domain.Customer;

/**
 * @author liumapp
 * @file CustomerService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/28/18
 */
public interface CustomerService {

    public Integer createCustomer (Customer customer);

    public Customer getCustomerById (Integer customerId);

    public Customer getCustomerByName (String name);

}
