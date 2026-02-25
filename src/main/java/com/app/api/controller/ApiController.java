package com.app.api.controller;

import com.app.api.entity.CustomerEntity;
import com.app.api.responseModel.ResponseBody;
import com.app.api.datasource.repository.CustomerRepository;
import com.app.api.dto.response.CustomerDto;
import com.app.api.service.ApiService;
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
    public ResponseBody<List<CustomerDto>> getCustomer() {
        var customers = apiService.listAllCustomer();
        System.out.println(customers);
        return new ResponseBody<>(true, "Customers retrieved successfully", customers);
    }
    @GetMapping("/debug")
    public List<CustomerEntity> debug() {
        return customerRepository.findAllNative();
    }

}

