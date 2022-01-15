package com.subhakar.spring;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BikeService implements VehicleService {
    @Override
    public void startEngine() {
        log.info("Starting BIKE Engine");
    }

    @Override
    public void move() {
        log.info("Driving BIKE");
    }

    @Override
    public void stopEngine() {
        log.info("Stop BIKE Engine");
    }
}
