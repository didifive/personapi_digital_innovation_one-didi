package one.digitalinnovation.didi.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapping;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String district;

    private Long idCity;

}
