package com.viral.parkingLot.controller;

import com.viral.parkingLot.component.ParkingLotComponent;
import com.viral.parkingLot.mapper.DTOMapper;
import com.viral.parkingLot.model.CreateParkingLotRequest;
import com.viral.parkingLot.model.CreateParkingLotResponse;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ParkingLotController {

    ParkingLotComponent parkingLotComponent;

    @PostMapping("/createParkingLot")
    CreateParkingLotResponse createParkingLot(@RequestBody @NonNull final
                                              CreateParkingLotRequest createParkingLotRequest) {
        return parkingLotComponent.createParkingLot(DTOMapper.MAPPER.toParkingLotMetadata(createParkingLotRequest));
    }
}
