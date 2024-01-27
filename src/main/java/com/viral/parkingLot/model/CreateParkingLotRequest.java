package com.viral.parkingLot.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class CreateParkingLotRequest {
    @NonNull List<Integer> slotsPerFloor;
}
