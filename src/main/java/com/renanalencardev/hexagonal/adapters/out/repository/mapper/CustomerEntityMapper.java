package com.renanalencardev.hexagonal.adapters.out.repository.mapper;

import com.renanalencardev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.renanalencardev.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
