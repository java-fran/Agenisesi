package com.senai.infoa.agenisesi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.agenisesi.models.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
    @Query(value="select * from aluno where cpf = :cpf", nativeQuery=true)
    public Aluno findByCpf(String cpf);
}
