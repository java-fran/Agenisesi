package com.senai.infoa.agenisesi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.agenisesi.models.Agenda;


@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer>{
    
}
