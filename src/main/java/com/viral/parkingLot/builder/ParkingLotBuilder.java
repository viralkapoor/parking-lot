package com.viral.parkingLot.builder;

import com.viral.parkingLot.model.ParkingLot;
import com.viral.parkingLot.model.ParkingLotMetadata;

public interface ParkingLotBuilder {

    ParkingLot createParkingLot(ParkingLotMetadata parkingLotMetadata);
}
