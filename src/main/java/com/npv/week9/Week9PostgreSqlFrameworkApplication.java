package com.npv.week9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.npv.week9", "com.example"})           // include where your @Entity classes live
@EnableJpaRepositories(basePackages = {"com.npv.week9", "com.example"}) // include where your repositories live
public class Week9PostgreSqlFrameworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(Week9PostgreSqlFrameworkApplication.class, args);
        System.out.println("Server has started");
    }
}
