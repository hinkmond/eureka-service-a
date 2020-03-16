package com.hinkmond.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}

@RestController
class ServiceARestController {
    @RequestMapping("/calc-mortgage-pymt/{term}")
    public String calculateMortgagePayment(
            @PathVariable String term) {
        // Calculate mortgage payment
        double mortPymt = (135000.00 / Double.parseDouble(term));
        return Double.toString(mortPymt);
    }
}
