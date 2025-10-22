package com.senai.infoa.agenisesi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.agenisesi.models.Agenda;
import com.senai.infoa.agenisesi.services.AgendaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
    
    @Autowired
    private AgendaService agendaService;
    @GetMapping("/listar")
    public List<Agenda> listarTodos() {
        return agendaService.listarTodos();
    }
    @PostMapping("/cadastro")
    public Agenda salvar(@RequestBody Agenda agenda) {
        return agendaService.salvar(agenda);
    }
}
