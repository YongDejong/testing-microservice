package com.example.demo.service.serviceImplement;

import com.example.demo.datasource.PrimaryRepository.CustomerRepository;
import com.example.demo.dto.PrimaryDto.customerDto;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ApiServiceImp implements ApiService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<customerDto> listAllCustomer() {
        return customerRepository.findAll().stream()
                .map(customerEntity -> new customerDto(
                        customerEntity.getCusID(),
                        customerEntity.getCusName(),
                        customerEntity.getCusContact()
                ))
                .toList();
    }
}
