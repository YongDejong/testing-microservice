package com.app.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbCustomers")
public class CustomerEntity {

    @Id
    @Column(name = "cusID")
    private String cusID;

    @Column(name = "CusName")
    private String cusName;

    @Column(name = "CusContact")
    private String cusContact;

}
