package com.viral.parkingLot.component;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ParkingLotComponent {

    public String createParkingLot() {
        log.info("Successfully created parking lot");
        return "Successful";
    }
}
