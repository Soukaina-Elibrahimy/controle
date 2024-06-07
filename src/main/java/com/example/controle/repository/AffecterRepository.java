package com.example.controle.repository;

import com.example.controle.model.Affecter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffecterRepository extends JpaRepository<Affecter,Long> {
}
