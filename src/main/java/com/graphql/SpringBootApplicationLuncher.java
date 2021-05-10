package com.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This Luncher for the spring boot application.
 *
 * @author manoj.bardhan
 *
 */
@SpringBootApplication
public class SpringBootApplicationLuncher extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationLuncher.class, args);
    }
}