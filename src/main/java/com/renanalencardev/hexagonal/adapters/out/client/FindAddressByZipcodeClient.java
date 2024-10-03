package com.renanalencardev.hexagonal.adapters.out.client;

import com.renanalencardev.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "FindAddressByZipcodeClient", url = "${renan.client.address.url}")
public interface FindAddressByZipcodeClient {
    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
