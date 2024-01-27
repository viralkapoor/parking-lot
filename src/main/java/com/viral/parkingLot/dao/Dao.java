package com.viral.parkingLot.dao;

import com.viral.parkingLot.model.ParkingLot;
import com.viral.parkingLot.model.ParkingLotMetadata;
import lombok.NonNull;

public interface Dao {
    ParkingLot createParkingLot(@NonNull final ParkingLotMetadata parkingLotMetadata);
}
