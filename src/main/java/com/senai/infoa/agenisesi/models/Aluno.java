package com.senai.infoa.agenisesi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome_completo")
    protected String nomeCompleto;

    @Column(name="senha")
    protected String senha;

    @Column(name="pet")
    protected int pet;

    @Column(name="cpf")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;
    
    public Aluno(){}

    public Aluno(Integer id, String nomeCompleto, String senha, int pet, String cpf, Turma turma) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.senha = senha;
        this.pet = pet;
        this.cpf = cpf;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPet() {
        return pet;
    }

    public void setPet(int pet) {
        this.pet = pet;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
}
