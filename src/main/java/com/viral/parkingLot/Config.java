package com.viral.parkingLot;

import com.viral.parkingLot.builder.ParkingLotBuilder;
import com.viral.parkingLot.builder.ParkingLotBuilderImpl;
import com.viral.parkingLot.component.ParkingLotComponent;
import com.viral.parkingLot.component.ParkingLotComponentImpl;
import com.viral.parkingLot.controller.ParkingLotController;
import com.viral.parkingLot.dao.MemoryDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ParkingLotComponent parkingLotComponent() {
        return new ParkingLotComponentImpl(parkingLotBuilder());
    }

    @Bean
    public ParkingLotController parkingLotController() {
        return new ParkingLotController(parkingLotComponent());
    }

    @Bean
    public ParkingLotBuilder parkingLotBuilder() {
        return new ParkingLotBuilderImpl(memoryDao());
    }

    @Bean
    public MemoryDao memoryDao() {
        return new MemoryDao();
    }
}
