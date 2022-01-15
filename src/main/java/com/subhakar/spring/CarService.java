package com.subhakar.spring;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarService implements VehicleService {
    @Override
    public void startEngine() {
        log.info("Start CAR Engine");
    }

    @Override
    public void move() {
        log.info("Driving CAR");
    }

    @Override
    public void stopEngine() {
        log.info("Stop CAR Engine");
    }
}
