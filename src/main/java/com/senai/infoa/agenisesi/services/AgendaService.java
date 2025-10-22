package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Agenda;
import com.senai.infoa.agenisesi.repositories.AgendaRepository;

@Service
public class AgendaService {
    
     @Autowired  
    private AgendaRepository agendaRepository;

    public List<Agenda> listarTodos(){
        return agendaRepository.findAll();
    }

     public Agenda salvar(Agenda agenda){
        return agendaRepository.save(agenda);
    }

}
