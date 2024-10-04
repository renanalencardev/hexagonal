package com.renanalencardev.hexagonal.application.ports.out;

import com.renanalencardev.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FIndCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
