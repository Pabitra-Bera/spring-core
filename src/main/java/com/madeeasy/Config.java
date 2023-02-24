package com.madeeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Doctor doctor(){
        return new Doctor(qualification());
    }
    @Bean
    public Qualification qualification(){
        return new Qualification();
    }
}
