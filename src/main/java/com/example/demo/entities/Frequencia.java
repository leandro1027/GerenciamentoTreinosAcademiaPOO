package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Frequencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date datafrequencia;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

}
