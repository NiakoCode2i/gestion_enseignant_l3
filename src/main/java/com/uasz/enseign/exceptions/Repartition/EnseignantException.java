package com.uasz.enseign.exceptions.Repartition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Définition d'une classe d'exception personnalisée nommée EnseignantException
public class EnseignantException extends RuntimeException {

    private String errorCode;

    // Constructeur avec un message d'erreur et un code d'erreur spécifique
    public EnseignantException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
