package com.minh.service;

import com.minh.model.Customer;
import com.minh.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
    List<Customer> findCustomersByFirstNameContaining(String firstName);
}
