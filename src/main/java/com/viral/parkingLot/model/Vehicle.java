package com.viral.parkingLot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicle {
    @NonNull String registrationNumber;
    @NonNull String color;
    @NonNull VehicleType vehicleType;
}
