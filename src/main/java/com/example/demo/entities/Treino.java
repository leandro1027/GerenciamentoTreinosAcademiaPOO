package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;

    private String carga;

    private String repeticao;

    private int id;

    private Date datatreino;

    private String descricao;

    private int duracao;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
