package one.digitalinnovation.didi.personapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.didi.personapi.dto.mapper.DistrictMapper;
import one.digitalinnovation.didi.personapi.dto.request.DistrictDTO;
import one.digitalinnovation.didi.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.didi.personapi.entities.District;
import one.digitalinnovation.didi.personapi.exception.DistrictNotFoundException;
import one.digitalinnovation.didi.personapi.repositories.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistrictService {

    private final DistrictRepository districtRepositoryRepository;

    private final DistrictMapper districtMapper;

    public MessageResponseDTO create(DistrictDTO districtDTO) {
        District district = districtMapper.toModel(districtDTO);
        District savedDistrict = districtRepositoryRepository.save(district);

        return createMessageResponse("District successfully created with ID ", savedDistrict.getId());
    }

    public DistrictDTO findById(Long id) throws DistrictNotFoundException {
        District district = districtRepositoryRepository.findById(id)
                .orElseThrow(() -> new DistrictNotFoundException(id));

        return districtMapper.toDTO(district);
    }

    public List<DistrictDTO> listAll() {
        List<District> district = districtRepositoryRepository.findAll();
        return district.stream()
                .map(districtMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, DistrictDTO districtDTO) throws DistrictNotFoundException {
        districtRepositoryRepository.findById(id)
                .orElseThrow(() -> new DistrictNotFoundException(id));

        District updatedDistrict = districtMapper.toModel(districtDTO);
        District savedDistrict = districtRepositoryRepository.save(updatedDistrict);

        return createMessageResponse("District successfully updated with ID ", savedDistrict.getId());
    }

    public void delete(Long id) throws DistrictNotFoundException {
        districtRepositoryRepository.findById(id)
                .orElseThrow(() -> new DistrictNotFoundException(id));

        districtRepositoryRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
