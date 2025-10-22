package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Materia;
import com.senai.infoa.agenisesi.services.MateriaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/materia")
public class MateriaController {
    
    @Autowired
    private MateriaService materiaService;
    @GetMapping("/listar")
    public List<Materia> listarTodos() {
        return materiaService.listarTodos();
    }
    @PostMapping("/cadastro")
    public Materia salvar(@RequestBody Materia materia) {
        return materiaService.salvar(materia);
    }
}
