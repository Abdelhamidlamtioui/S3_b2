package com.abdehamid.GestionFormation.exceptions;

public class FormationNotFoundException extends RuntimeException {

    public FormationNotFoundException(Long id) {
        super("Formation not found with ID: " + id);
    }
}

