package com.example.sprin_app.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.RecursiveTask;

@Configuration
public class HelloConfigurantion {
    @Bean
    public SDKAWS sdkAWS(){
        return new SDKAWS();
    }
}
