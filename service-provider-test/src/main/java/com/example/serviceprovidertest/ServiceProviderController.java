package com.example.serviceprovidertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
