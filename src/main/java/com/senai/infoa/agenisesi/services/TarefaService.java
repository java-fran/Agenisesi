package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Tarefa;
import com.senai.infoa.agenisesi.repositories.TarefaRepository;

@Service
public class TarefaService {
    
     @Autowired  
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTodos(){
        return tarefaRepository.findAll();
    }

     public Tarefa salvar(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

}
