package com.ayahathout.microservices.service_a.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping
    public String getEmployeeInfo() {
        return "Aya Hathout";
    }
}
