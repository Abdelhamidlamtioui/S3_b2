package com.abdehamid.GestionFormation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdehamid.GestionFormation.model.Formateur;

public interface FormateurRepository extends JpaRepository<Formateur,Long> {
    Optional<Formateur>findByNom(String nom);
}
