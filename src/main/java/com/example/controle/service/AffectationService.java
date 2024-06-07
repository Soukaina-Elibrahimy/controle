package com.example.controle.service;

import com.example.controle.model.Affecter;
import com.example.controle.repository.AffecterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AffectationService {
    @Autowired
    private AffecterRepository affectationRepository;

    public Affecter save(Affecter affectation) {
        return affectationRepository.save(affectation);
    }
}
