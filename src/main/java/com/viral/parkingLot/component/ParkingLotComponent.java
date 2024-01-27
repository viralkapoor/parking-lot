package com.viral.parkingLot.component;

import com.viral.parkingLot.model.CreateParkingLotResponse;
import com.viral.parkingLot.model.ParkingLotMetadata;

public interface ParkingLotComponent {
    CreateParkingLotResponse createParkingLot(ParkingLotMetadata parkingLotMetadata);
}
