package com.janlei;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.janlei")
public class ConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConfigApplication.class, args);
    }
}
