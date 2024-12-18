package com.abdehamid.GestionFormation.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@DiscriminatorValue("APPRENANT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apprenant extends User {

    @NotBlank(message = "Le niveau est obligatoire")
    private String niveau;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    @JsonBackReference("classe-apprenant")
    private Classe classe;

    @ManyToOne
    @JsonBackReference("formation-apprenant")
    @JoinColumn(name = "formation_id")
    private Formation formation;

     public String getClasseNom() {
        return classe != null ? classe.getNom() : null;
    }

    public String getFormationNom() {
        return formation != null ? formation.getTitre() : null;
    }
}

