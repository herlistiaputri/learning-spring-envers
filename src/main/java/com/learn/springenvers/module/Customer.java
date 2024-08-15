package com.learn.springenvers.module;

import com.learn.springenvers.base.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import java.util.UUID;

@Entity
@Data
@Table(name = "customer")
@Audited
public class Customer extends BaseModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id = UUID.randomUUID().toString();;

    private String name;
    private String address;
    private String email;
    private String birthDate;

}
