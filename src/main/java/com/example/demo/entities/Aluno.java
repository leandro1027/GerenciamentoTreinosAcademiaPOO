package com.example.demo.entities;

import jakarta.persistence.*;
import javafx.fxml.FXML;
import lombok.*;

import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @FXML
    private String nome;

    @FXML
    private String email;

    @FXML
    private int idade;



    }
