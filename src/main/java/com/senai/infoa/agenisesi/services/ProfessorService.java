package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Professor;
import com.senai.infoa.agenisesi.repositories.ProfessorRepository;

@Service
public class ProfessorService {
    
    @Autowired  
    private ProfessorRepository professorRepository;

     public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    public List<Professor> listarTodos(){
        return professorRepository.findAll();
    }

    public String login(String cpf, String senha){
        Professor professor = professorRepository.findByCpf(cpf);
        if(professor != null && senha.equals(professor.getSenha())){
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }
}
