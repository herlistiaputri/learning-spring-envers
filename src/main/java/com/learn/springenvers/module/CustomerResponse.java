package com.learn.springenvers.module;

import lombok.Data;

@Data
public class CustomerResponse {

    private String id;
    private String name;
    private String address;
    private String email;
    private String birthDate;
    private String createdAt;
    private String updatedAt;

}
