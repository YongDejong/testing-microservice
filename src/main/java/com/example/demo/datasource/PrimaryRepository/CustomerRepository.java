package com.example.demo.datasource.PrimaryRepository;

import com.example.demo.PrimaryEntity.customerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<customerEntity,String> {
    @Query(value = "SELECT cusID, CusName, CusContact from tbCustomers", nativeQuery = true)
    List<customerEntity> findAllNative();

}
