package com.senai.infoa.agenisesi.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="agenda")
public class Agenda {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_proposta")
    protected LocalDate dataProposta;

    @Column(name="data_entrega")
    protected LocalDate dataEntrega;

    public Agenda (){}

    public Agenda(Integer id, LocalDate dataProposta, LocalDate dataEntrega, Tarefa tarefa) {
        this.id = id;
        this.dataProposta = dataProposta;
        this.dataEntrega = dataEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataProposta() {
        return dataProposta;
    }

    public void setDataProposta(LocalDate dataProposta) {
        this.dataProposta = dataProposta;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
