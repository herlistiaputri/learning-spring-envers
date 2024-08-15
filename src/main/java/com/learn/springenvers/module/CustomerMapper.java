package com.learn.springenvers.module;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public static Customer mapToObject(CustomerRequest request){
        Customer entity = new Customer();
        entity.setName(request.getName());
        entity.setAddress(request.getAddress());
        entity.setBirthDate(request.getBirthDate());
        entity.setEmail(request.getEmail());
        return entity;
    }

    public static CustomerResponse mapToResponse(Customer entity){
        CustomerResponse response = new CustomerResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setAddress(entity.getAddress());
        response.setEmail(entity.getEmail());
        response.setBirthDate(entity.getBirthDate());
        response.setCreatedAt(entity.getCreatedAt().toString());
        response.setUpdatedAt(entity.getUpdatedAt().toString());
        return response;
    }

}
