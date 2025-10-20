package com.senai.infoa.agenisesi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.agenisesi.models.Tarefa;


@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{
    
}
