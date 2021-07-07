package one.digitalinnovation.didi.personapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.didi.personapi.dto.mapper.CityMapper;
import one.digitalinnovation.didi.personapi.dto.request.CityDTO;
import one.digitalinnovation.didi.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.didi.personapi.entities.City;
import one.digitalinnovation.didi.personapi.exception.CityNotFoundException;
import one.digitalinnovation.didi.personapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {

    private final CityRepository cityRepository;

    private final CityMapper cityMapper;

    public MessageResponseDTO create(CityDTO cityDTO) {
        City city = cityMapper.toModel(cityDTO);
        City savedCity = cityRepository.save(city);

        return createMessageResponse("City successfully created with ID ", savedCity.getId());
    }

    public CityDTO findById(Long id) throws CityNotFoundException {
        City city = cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));

        return cityMapper.toDTO(city);
    }

    public List<CityDTO> listAll() {
        List<City> city = cityRepository.findAll();
        return city.stream()
                .map(cityMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, CityDTO cityDTO) throws CityNotFoundException {
        cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));

        City updatedCity = cityMapper.toModel(cityDTO);
        City savedCity = cityRepository.save(updatedCity);

        return createMessageResponse("City successfully updated with ID ", savedCity.getId());
    }

    public void delete(Long id) throws CityNotFoundException {
        cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));

        cityRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
