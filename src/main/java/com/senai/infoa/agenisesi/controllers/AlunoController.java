package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Aluno;
import com.senai.infoa.agenisesi.services.AlunoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
     @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastro")
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

   @PostMapping("/login")
    public String login(@RequestParam String cpf, @RequestParam String senha) {
        return alunoService.login(cpf,senha);
    }
    
}
