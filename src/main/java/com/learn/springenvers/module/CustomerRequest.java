package com.learn.springenvers.module;

import lombok.Data;

@Data
public class CustomerRequest {
    private String name;
    private String address;
    private String email;
    private String birthDate;
}
