package com.example.demo.controllers;

import com.example.demo.telas.aluno.TelaAlunosInicial;
import com.example.demo.telas.exemplo.TelaAlunos;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaAlunosInicial telaAlunosInicial;

    public TelaInicialController(TelaAlunosInicial telaalunosInicial) {
        this.telaAlunosInicial = telaAlunosInicial;
    }

    @FXML
    protected void onAlunosButtonClick() {
        telaAlunosInicial.abrir();
    }

}