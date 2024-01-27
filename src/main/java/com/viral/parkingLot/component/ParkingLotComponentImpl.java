package com.viral.parkingLot.component;

import com.viral.parkingLot.builder.ParkingLotBuilder;
import com.viral.parkingLot.model.CreateParkingLotResponse;
import com.viral.parkingLot.model.ParkingLot;
import com.viral.parkingLot.model.ParkingLotMetadata;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class ParkingLotComponentImpl implements ParkingLotComponent {

    ParkingLotBuilder parkingLotBuilder;

    public CreateParkingLotResponse createParkingLot(@NonNull final ParkingLotMetadata parkingLotMetadata) {
        parkingLotBuilder.createParkingLot(parkingLotMetadata);
        return CreateParkingLotResponse.builder()
                .status("Success")
                .build();
    }
}
