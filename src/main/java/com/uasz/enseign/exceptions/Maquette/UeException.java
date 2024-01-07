package com.uasz.enseign.exceptions.Maquette;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Utilisation de @EqualsAndHashCode pour inclure également la propriété errorCode dans la comparaison des égalités
@EqualsAndHashCode(callSuper = true)
public class UeException extends RuntimeException {

    private String errorCode;

    public UeException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
