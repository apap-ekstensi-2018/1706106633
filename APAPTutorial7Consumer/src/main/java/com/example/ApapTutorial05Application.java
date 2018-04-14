package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApapTutorial05Application
{

    public static void main (String[] args)
    {
        SpringApplication.run (ApapTutorial05Application.class, args);
    }
    
    @Bean
    public RestTemplate restTemplate() {
	    return new RestTemplate();
    }
}
