package com.example.demo.controller;

import com.example.demo.PrimaryEntity.customerEntity;
import com.example.demo.ResponseBody;
import com.example.demo.datasource.PrimaryRepository.CustomerRepository;
import com.example.demo.dto.PrimaryDto.customerDto;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ApiController {

    @Autowired
    ApiService apiService;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello RUPP";
    }

    @GetMapping("/getCustomer")
    public ResponseBody<List<customerDto>> getCustomer() {
        var customers = apiService.listAllCustomer();
        System.out.println(customers);
        return new ResponseBody<>(true, "Customers retrieved successfully", customers);
    }
    @GetMapping("/debug")
    public List<customerEntity> debug() {
        return customerRepository.findAllNative();
    }

}

