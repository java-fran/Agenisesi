package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Turma;
import com.senai.infoa.agenisesi.services.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    
    @Autowired
    private TurmaService turmaService;
    @GetMapping("/listar")
    public List<Turma> listarTodos() {
        return turmaService.listarTodos();
    }
}
