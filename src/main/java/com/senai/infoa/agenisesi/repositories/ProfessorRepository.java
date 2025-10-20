package com.senai.infoa.agenisesi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.agenisesi.models.Professor;


@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
    
    @Query(value="select * from professor where cpf = :cpf", nativeQuery=true)
    public Professor findByCpf(String cpf);
}
