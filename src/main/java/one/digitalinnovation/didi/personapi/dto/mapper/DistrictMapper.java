package one.digitalinnovation.didi.personapi.dto.mapper;

import one.digitalinnovation.didi.personapi.entities.District;
import one.digitalinnovation.didi.personapi.dto.request.DistrictDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DistrictMapper {

    District toModel(DistrictDTO dto);

    DistrictDTO toDTO(District dto);
}
