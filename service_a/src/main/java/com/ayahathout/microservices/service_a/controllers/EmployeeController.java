package com.ayahathout.microservices.service_a.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getEmployeeInfo() {
        String address = restTemplate.getForObject("http://localhost:8082/addresses", String.class);

        return "Aya Hathout, " + address;
    }
}
