package com.renanalencardev.hexagonal.application.core.usecase;

import com.renanalencardev.hexagonal.application.core.domain.Customer;
import com.renanalencardev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.renanalencardev.hexagonal.application.ports.out.FIndCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {
    private final FIndCustomerByIdOutputPort fIndCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FIndCustomerByIdOutputPort fIndCustomerByIdOutputPort) {
        this.fIndCustomerByIdOutputPort = fIndCustomerByIdOutputPort;
    }
    @Override
    public Customer find(String id) {
        return fIndCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

    }
}
