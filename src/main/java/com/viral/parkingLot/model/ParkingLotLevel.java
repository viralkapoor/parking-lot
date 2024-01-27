package com.viral.parkingLot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParkingLotLevel {
    @NonNull List<ParkingSlot> parkingSlots;
}
