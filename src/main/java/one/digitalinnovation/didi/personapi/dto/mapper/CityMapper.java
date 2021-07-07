package one.digitalinnovation.didi.personapi.dto.mapper;

import one.digitalinnovation.didi.personapi.dto.request.CityDTO;
import one.digitalinnovation.didi.personapi.entities.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CityMapper {

    City toModel(CityDTO dto);

    CityDTO toDTO(City dto);
}
