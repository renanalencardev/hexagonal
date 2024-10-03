package com.renanalencardev.hexagonal.application.ports.out;

import com.renanalencardev.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodOutputPort {
    Address find(String zipCode);
}
