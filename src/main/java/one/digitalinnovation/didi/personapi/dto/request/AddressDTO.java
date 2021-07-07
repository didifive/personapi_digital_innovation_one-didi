package one.digitalinnovation.didi.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.didi.personapi.enums.AddressType;
import one.digitalinnovation.didi.personapi.enums.StreetType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @Enumerated(EnumType.STRING)
    private StreetType streetType;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String street;

    @NotNull
    private Integer number;

    @NotNull
    private Long idDistrict;
}
