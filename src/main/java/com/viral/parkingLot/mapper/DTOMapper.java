package com.viral.parkingLot.mapper;

import com.viral.parkingLot.model.CreateParkingLotRequest;
import com.viral.parkingLot.model.ParkingLotMetadata;
import lombok.NonNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DTOMapper {

    DTOMapper MAPPER = Mappers.getMapper(DTOMapper.class);

    @Mapping(source = "createParkingLotRequest", target = "levels", qualifiedByName = "getLevels")
    ParkingLotMetadata toParkingLotMetadata(@NonNull final CreateParkingLotRequest createParkingLotRequest);

    @Named("getLevels")
    default int getLevels(final CreateParkingLotRequest createParkingLotRequest) {
        return createParkingLotRequest.getSlotsPerFloor().size();
    }

}
