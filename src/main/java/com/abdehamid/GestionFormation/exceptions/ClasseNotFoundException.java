package com.abdehamid.GestionFormation.exceptions;

public class ClasseNotFoundException extends RuntimeException {

    public ClasseNotFoundException(Long id) {
        super("Classe not found with ID: " + id);
    }
}
