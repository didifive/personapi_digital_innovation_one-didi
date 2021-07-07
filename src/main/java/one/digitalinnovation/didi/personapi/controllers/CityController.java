package one.digitalinnovation.didi.personapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.didi.personapi.dto.request.CityDTO;
import one.digitalinnovation.didi.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.didi.personapi.exception.CityNotFoundException;
import one.digitalinnovation.didi.personapi.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/city")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

//    Construtor para testar o API
//    @GetMapping
//    public String getBook() {
//        return "Olá, estou funcionando :D";
//    }


    private final CityService cityService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid CityDTO cityDTO) {
        return cityService.create(cityDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CityDTO findById(@PathVariable Long id) throws CityNotFoundException {
        return cityService.findById(id);
    }

    @GetMapping
    public List<CityDTO> listAll() {
        return cityService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid CityDTO cityDTO) throws CityNotFoundException {
        return cityService.update(id, cityDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws CityNotFoundException {
        cityService.delete(id);
    }
}
