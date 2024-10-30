package com.abdehamid.GestionFormation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdehamid.GestionFormation.model.Classe;

public interface ClasseRepository extends JpaRepository<Classe,Long> {

    Optional<Classe> findByNom(String nom);

}
