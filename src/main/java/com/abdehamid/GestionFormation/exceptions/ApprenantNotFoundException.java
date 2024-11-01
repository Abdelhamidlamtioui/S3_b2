package com.abdehamid.GestionFormation.exceptions;

public class ApprenantNotFoundException extends RuntimeException {

    public ApprenantNotFoundException(Long id) {
        super("Apprenant not found with id: " + id);
    }
}
