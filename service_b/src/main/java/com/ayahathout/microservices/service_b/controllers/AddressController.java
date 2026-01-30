package com.ayahathout.microservices.service_b.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping
    public String getAddress() {
        return "6th of October";
    }
}
