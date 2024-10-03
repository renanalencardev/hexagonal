package com.renanalencardev.hexagonal.adapters.out.client.mapper;

import com.renanalencardev.hexagonal.adapters.out.client.response.AddressResponse;
import com.renanalencardev.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
