package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import javax.print.attribute.standard.Media;
import java.nio.MappedByteBuffer;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String email;

    private int idade;

    @OneToMany(mappedBy = "aluno")
    private List<Avaliacao> avaliacoes;

    @OneToMany(mappedBy = "aluno")
    private List<Frequencia> frequencias;

    @OneToMany(mappedBy = "aluno")
    private List<Treino> treinos;

    }
