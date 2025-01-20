package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date data;

    private double nota;

    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

}
