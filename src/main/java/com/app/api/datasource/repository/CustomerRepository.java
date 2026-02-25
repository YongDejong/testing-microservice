package com.app.api.datasource.repository;

import com.app.api.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,String> {
    @Query(value = "SELECT cusID, CusName, CusContact from tbCustomers", nativeQuery = true)
    List<CustomerEntity> findAllNative();

}
