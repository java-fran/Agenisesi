package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Materia;
import com.senai.infoa.agenisesi.repositories.MateriaRepository;

@Service
public class MateriaService {
    
     @Autowired  
    private MateriaRepository materiaRepository;

    public List<Materia> listarTodos(){
        return materiaRepository.findAll();
    }
}
