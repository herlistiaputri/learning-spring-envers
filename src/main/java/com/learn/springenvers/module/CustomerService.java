package com.learn.springenvers.module;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public void create(CustomerRequest request) {
        Customer customer = CustomerMapper.mapToObject(request);
        repository.save(customer);
    }
}
