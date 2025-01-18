package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date datatreino;

    private String descricao;

    private int duracao;
}
