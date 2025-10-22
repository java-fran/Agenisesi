package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Professor;
import com.senai.infoa.agenisesi.services.ProfessorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    @PostMapping("/cadastro")
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }

    @GetMapping("/listar")
    public List<Professor> listarTodos() {
        return professorService.listarTodos();
    }

    @PostMapping("/login")
    public String login(@RequestParam String cpf, @RequestParam String senha) {
        return professorService.login(cpf,senha);
    }
    
}