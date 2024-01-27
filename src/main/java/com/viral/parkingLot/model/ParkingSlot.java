package com.viral.parkingLot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParkingSlot {
    int slotNumber;
    @NonNull VehicleType vehicleType;
}
