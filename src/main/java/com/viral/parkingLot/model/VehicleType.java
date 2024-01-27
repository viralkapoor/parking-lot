package com.viral.parkingLot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum VehicleType {

    BIKE("BIKE"),
    CAR("CAR"),
    TRUCK("TRUCK");

    String value;
}
