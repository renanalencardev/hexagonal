package com.renanalencardev.hexagonal.application.ports.in;

import com.renanalencardev.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
