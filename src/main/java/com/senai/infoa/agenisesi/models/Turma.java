package com.senai.infoa.agenisesi.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="turma")
public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="numero")
    protected String numero;

    @ManyToMany
    @JoinTable(
        name = "turma_professor",
        joinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id")
    )
    private List<Professor> professors;

    public Turma (){}

    public Turma(Integer id, String numero, List<Professor> professors) {
        this.id = id;
        this.numero = numero;
        this.professors = professors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    

}
