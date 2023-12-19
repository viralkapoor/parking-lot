package com.viral.parkingLot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ParkingLotComponent parkingLotComponent() {
        return new ParkingLotComponent();
    }

    @Bean
    public ParkingLotController parkingLotController() {
        return new ParkingLotController(parkingLotComponent());
    }
}
