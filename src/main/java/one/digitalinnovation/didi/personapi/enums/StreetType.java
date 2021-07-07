package one.digitalinnovation.didi.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StreetType {

    AVENUE("Alameda"),
    BOULEVARD("Avenida"),
    BYSTREET("Travessa"),
    STREET("Rua");

    private final String description;
}
