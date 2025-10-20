package com.senai.infoa.agenisesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.agenisesi.models.Aluno;
import com.senai.infoa.agenisesi.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired  
    private AlunoRepository alunoRepository;

     public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    public String login(String cpf, String senha){
        Aluno aluno = alunoRepository.findByCpf(cpf);
        if(aluno != null && senha.equals(aluno.getSenha())){
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar login";
    }
}
