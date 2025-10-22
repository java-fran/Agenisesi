package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Tarefa;
import com.senai.infoa.agenisesi.services.TarefaService;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
    
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/listar")
    public List<Tarefa> listarTodos() {
        return tarefaService.listarTodos();
    }
}
