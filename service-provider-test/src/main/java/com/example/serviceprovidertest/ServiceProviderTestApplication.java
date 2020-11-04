package com.example.serviceprovidertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProviderTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderTestApplication.class, args);
    }

}
