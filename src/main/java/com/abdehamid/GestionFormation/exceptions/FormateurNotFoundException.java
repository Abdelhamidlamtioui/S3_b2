package com.abdehamid.GestionFormation.exceptions;

public class FormateurNotFoundException extends RuntimeException {

    public FormateurNotFoundException(Long id) {
        super("Formateur not found with id: " + id);
    }
}
