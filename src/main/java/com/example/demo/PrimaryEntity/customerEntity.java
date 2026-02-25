package com.example.demo.PrimaryEntity;

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
public class customerEntity {

    @Id
    @Column(name = "cusID")
    private String cusID;

    @Column(name = "CusName")
    private String cusName;

    @Column(name = "CusContact")
    private String cusContact;

}
