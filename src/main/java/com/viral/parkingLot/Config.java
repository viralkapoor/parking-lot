package com.viral.parkingLot;

import com.viral.parkingLot.component.ParkingLotComponent;
import com.viral.parkingLot.controller.ParkingLotController;
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
