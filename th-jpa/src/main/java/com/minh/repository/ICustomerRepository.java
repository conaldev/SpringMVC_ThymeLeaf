package com.minh.repository;

import com.minh.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer model);

    void remove(Long id);
}
