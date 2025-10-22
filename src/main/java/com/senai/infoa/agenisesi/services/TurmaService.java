package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Turma;
import com.senai.infoa.agenisesi.repositories.TurmaRepository;

@Service
public class TurmaService {
    
     @Autowired  
    private TurmaRepository turmaRepository;

    public List<Turma> listarTodos(){
        return turmaRepository.findAll();
    }
}
