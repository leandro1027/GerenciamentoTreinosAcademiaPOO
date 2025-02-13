package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Agora é um int, já que estamos utilizando uma chave primária numérica

    private String nome;
    private String carga;
    private String repeticao;
    private Date datatreino;
    private String descricao;
    private int duracao;

    private String imagem;  // Novo campo para a imagem associada ao treino (pode ser URL ou caminho local)

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
