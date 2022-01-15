package com.subhakar.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("carServiceConfiguration")
    public VehicleService carService() {
        return new CarService();
    }

    @Bean
    @Qualifier("bikeServiceConfiguration")
    public VehicleService bikeService() {
        return new BikeService();
    }
}
