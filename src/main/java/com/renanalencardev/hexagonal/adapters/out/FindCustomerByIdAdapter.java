package com.renanalencardev.hexagonal.adapters.out;

import com.renanalencardev.hexagonal.adapters.out.repository.CustomerRepository;
import com.renanalencardev.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.renanalencardev.hexagonal.application.core.domain.Customer;
import com.renanalencardev.hexagonal.application.ports.out.FIndCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FIndCustomerByIdOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
