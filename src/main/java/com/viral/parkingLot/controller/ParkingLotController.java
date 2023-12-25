package com.viral.parkingLot.controller;

import com.viral.parkingLot.component.ParkingLotComponent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ParkingLotController {

    ParkingLotComponent parkingLotComponent;

    @GetMapping("/createParkingLot")
    String createParkingLot() {
        return parkingLotComponent.createParkingLot();
    }
}
