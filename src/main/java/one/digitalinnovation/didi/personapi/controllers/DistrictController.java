package one.digitalinnovation.didi.personapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.didi.personapi.dto.request.CityDTO;
import one.digitalinnovation.didi.personapi.dto.request.DistrictDTO;
import one.digitalinnovation.didi.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.didi.personapi.exception.CityNotFoundException;
import one.digitalinnovation.didi.personapi.exception.DistrictNotFoundException;
import one.digitalinnovation.didi.personapi.services.CityService;
import one.digitalinnovation.didi.personapi.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/district")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistrictController {

//    Construtor para testar o API
//    @GetMapping
//    public String getBook() {
//        return "Olá, estou funcionando :D";
//    }


    private final DistrictService districtService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid DistrictDTO districtDTO) {
        return districtService.create(districtDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DistrictDTO findById(@PathVariable Long id) throws DistrictNotFoundException {
        return districtService.findById(id);
    }

    @GetMapping
    public List<DistrictDTO> listAll() {
        return districtService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid DistrictDTO districtDTO) throws DistrictNotFoundException {
        return districtService.update(id, districtDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws DistrictNotFoundException {
        districtService.delete(id);
    }
}
