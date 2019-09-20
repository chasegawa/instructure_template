package com.instructure.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan(basePackages = { "org.instructure" })
// Remove the following annotation if you want to have Spring Boot autoconfigure a datasource for you
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@Slf4j // We use LOMBOK to generate a "log" object
public class ApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class, args);
    }
}
