package com.renanalencardev.hexagonal.application.core.usecase;

import com.renanalencardev.hexagonal.application.core.domain.Customer;
import com.renanalencardev.hexagonal.application.ports.out.FindAddressByZipCodOutputPort;
import com.renanalencardev.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {
    private final FindAddressByZipCodOutputPort findAddressByZipCodOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodOutputPort findAddressByZipCodOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodOutputPort = findAddressByZipCodOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
