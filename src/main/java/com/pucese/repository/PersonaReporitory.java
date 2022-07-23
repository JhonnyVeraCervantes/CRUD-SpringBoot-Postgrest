package com.pucese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucese.model.Persona;

public interface PersonaReporitory extends JpaRepository<Persona, Long>{

}