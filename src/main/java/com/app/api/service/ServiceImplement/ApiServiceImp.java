package com.app.api.service.ServiceImplement;

import com.app.api.datasource.repository.CustomerRepository;
import com.app.api.dto.response.CustomerDto;
import com.app.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ApiServiceImp implements ApiService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> listAllCustomer() {
        return customerRepository.findAll().stream()
                .map(customerEntity -> new CustomerDto(
                        customerEntity.getCusID(),
                        customerEntity.getCusName(),
                        customerEntity.getCusContact()
                ))
                .toList();
    }
}
