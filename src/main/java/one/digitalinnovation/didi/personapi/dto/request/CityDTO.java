package one.digitalinnovation.didi.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.didi.personapi.enums.State;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String city;

    @Enumerated(EnumType.STRING)
    private State state;

}
