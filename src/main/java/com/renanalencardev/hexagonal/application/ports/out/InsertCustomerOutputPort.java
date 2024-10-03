package com.renanalencardev.hexagonal.application.ports.out;

import com.renanalencardev.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
