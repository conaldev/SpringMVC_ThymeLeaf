package com.minh.repository;

import com.minh.model.Customer;
import com.minh.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer> findAll(Pageable pageable);

    Iterable<Customer> findAllByProvince(Province province);
    List<Customer> findCustomersByFirstNameContaining(String firstName);
}
