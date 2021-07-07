package one.digitalinnovation.didi.personapi.dto.mapper;

import one.digitalinnovation.didi.personapi.dto.request.PersonDTO;
import one.digitalinnovation.didi.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
