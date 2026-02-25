package com.app.api.service;

import com.app.api.dto.response.CustomerDto;

import java.util.List;

public interface ApiService {
    List <CustomerDto> listAllCustomer();
}
