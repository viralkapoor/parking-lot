package com.viral.parkingLot.builder;

import com.viral.parkingLot.dao.Dao;
import com.viral.parkingLot.model.ParkingLot;
import com.viral.parkingLot.model.ParkingLotMetadata;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class ParkingLotBuilderImpl implements ParkingLotBuilder {

    Dao dao;

    @Override
    public ParkingLot createParkingLot(@NonNull final ParkingLotMetadata parkingLotMetadata) {
        return dao.createParkingLot(parkingLotMetadata);
    }
}
