package com.subhakar.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringConfigurationQualifierApplicationTest {
    @Autowired
    @Qualifier("carServiceConfiguration")
    private VehicleService vehicleService;

    @Test
    public void testVehicleService() {
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }

}