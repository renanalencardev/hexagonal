package com.renanalencardev.hexagonal.adapters.out;

import com.renanalencardev.hexagonal.adapters.out.repository.CustomerRepository;
import com.renanalencardev.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.renanalencardev.hexagonal.application.core.domain.Customer;
import com.renanalencardev.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {
    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;
    public InsertCustomerAdapter(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
        this.customerRepository = customerRepository;
        this.customerEntityMapper = customerEntityMapper;
    }

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
