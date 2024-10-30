package com.abdehamid.GestionFormation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdehamid.GestionFormation.model.Formation;

public interface FormationRepository extends JpaRepository<Formation,Long> {
    Optional<Formation> findByTitre(String titre);
}