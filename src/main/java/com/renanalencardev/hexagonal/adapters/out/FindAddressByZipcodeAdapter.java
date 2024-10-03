package com.renanalencardev.hexagonal.adapters.out;

import com.renanalencardev.hexagonal.adapters.out.client.FindAddressByZipcodeClient;
import com.renanalencardev.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.renanalencardev.hexagonal.application.core.domain.Address;
import com.renanalencardev.hexagonal.application.ports.out.FindAddressByZipCodOutputPort;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipcodeAdapter implements FindAddressByZipCodOutputPort {
    private FindAddressByZipcodeClient findAddressByZipcodeClient;
    private AddressResponseMapper addressResponseMapper;

    public FindAddressByZipcodeAdapter(FindAddressByZipcodeClient findAddressByZipcodeClient) {
        this.findAddressByZipcodeClient = findAddressByZipcodeClient;
    }

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipcodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
