package one.digitalinnovation.didi.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {

    COMMERCIAL("Comercial"),
    HOME("Residencial"),
    MAILING("Correspondência");

    private final String description;
}
