package com.renanalencardev.hexagonal.application.ports.in;

import com.renanalencardev.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
