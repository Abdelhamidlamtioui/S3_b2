package com.abdehamid.GestionFormation.service.Impl;

import java.util.Optional;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.abdehamid.GestionFormation.exceptions.FormateurNotFoundException;
import com.abdehamid.GestionFormation.model.Formateur;
import com.abdehamid.GestionFormation.repository.FormateurRepository;
import com.abdehamid.GestionFormation.service.Interface.IGeneralService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FormateurServiceImpl implements IGeneralService<Formateur, Long> {

    private final FormateurRepository formateurRepository;

    @Override
    public Formateur create(Formateur entity) {
        return formateurRepository.save(entity);
    }

    @Override
    public Formateur update(Long id, Formateur entity) {
        return formateurRepository.findById(id)
                .map(existingFormateur -> {
                    existingFormateur.setNom(entity.getNom());
                    existingFormateur.setPrenom(entity.getPrenom());
                    existingFormateur.setEmail(entity.getEmail());
                    existingFormateur.setSpecialite(entity.getSpecialite());
                    existingFormateur.setClasse(entity.getClasse());
                    existingFormateur.setFormation(entity.getFormation());
                    return formateurRepository.save(existingFormateur);
                })
                .orElseThrow(() -> new FormateurNotFoundException(id));
    }

    @Override
    public String delete(Long id) {
        if (!formateurRepository.existsById(id)) {
            throw new FormateurNotFoundException(id);
        }
        formateurRepository.deleteById(id);
        return "Formateur supprimé avec succès !";
    }

    @Override
    public Optional<Formateur> findById(Long id) {
        if (!formateurRepository.existsById(id)) {
            throw new FormateurNotFoundException(id);
        }
        return formateurRepository.findById(id);
    }

    @Override
    public Page<Formateur> findAll(Pageable pageable) {
        return formateurRepository.findAll(pageable);
    }

    @Override
    public Optional<Formateur> findByNom(String nom) {
        return formateurRepository.findByNom(nom);
    }
}
