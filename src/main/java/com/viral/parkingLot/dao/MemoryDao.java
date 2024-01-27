package com.viral.parkingLot.dao;

import com.viral.parkingLot.model.*;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MemoryDao implements Dao {
    public ParkingLot createParkingLot(@NonNull final ParkingLotMetadata parkingLotMetadata) {
        return ParkingLot.builder()
                .levels(parkingLotMetadata.getLevels())
                .parkingLotLevels(createParkingLotLevels(parkingLotMetadata.getSlotsPerFloor()))
                .build();
    }

    private List<ParkingLotLevel> createParkingLotLevels(final List<Integer> slotsPerFloor) {
        final List<ParkingLotLevel> parkingLotLevels = new ArrayList<>();
        for(int slots: slotsPerFloor) {
            parkingLotLevels.add(ParkingLotLevel.builder()
                    .parkingSlots(createParkingSlots(slots))
                    .build());
        }
        return parkingLotLevels;
    }

    private List<ParkingSlot> createParkingSlots(int slots) {
        final List<ParkingSlot> parkingSlots = new ArrayList<>();
        for(int i=0; i<slots; i++) {
            if (i<5) {
                parkingSlots.add(ParkingSlot.builder()
                        .slotNumber(i+1)
                        .vehicleType(VehicleType.BIKE)
                        .build());
            } else if (i<10) {
                parkingSlots.add(ParkingSlot.builder()
                        .slotNumber(i+1)
                        .vehicleType(VehicleType.CAR)
                        .build());
            } else {
                parkingSlots.add(ParkingSlot.builder()
                        .slotNumber(i+1)
                        .vehicleType(VehicleType.CAR)
                        .build());
            }
        }
        return parkingSlots;
    }

}
