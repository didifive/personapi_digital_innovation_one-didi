package one.digitalinnovation.didi.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DistrictNotFoundException extends Exception {

    public DistrictNotFoundException(Long id) {
        super(String.format("District with ID %s not found!", id));
    }
}
