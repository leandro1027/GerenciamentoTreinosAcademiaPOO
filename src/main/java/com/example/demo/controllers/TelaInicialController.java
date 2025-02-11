package com.example.demo.controllers;

import com.example.demo.telas.exemplo.TelaAlunos;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaAlunos telaAlunos;
    private TelaAlunos telaAdicionarAluno;
    private TelaAlunos telaAtualizarAluno;
    private TelaAlunos telaVisualizarAluno;

    public TelaInicialController(TelaAlunos telaAlunos, TelaAlunos telaAdicionarAluno,
                                 TelaAlunos telaAtualizarAluno, TelaAlunos telaVisualizarAluno) {
        this.telaAlunos = telaAlunos;
        this.telaAdicionarAluno = telaAdicionarAluno;
        this.telaAtualizarAluno = telaAtualizarAluno;
        this.telaVisualizarAluno = telaVisualizarAluno;

    }

    @FXML
    protected void onAbrirAlunosButtonClick() {
        telaAlunos.abrir();
    }

    @FXML
    protected void onNovoAlunoButtonClick(){
        telaAdicionarAluno.abrir();
    }

    @FXML
    protected void onExcluirAlunoButtonClick(){
        telaAtualizarAluno.abrir();
    }

    @FXML
    protected void onEditarAlunoButtonClick(){
        telaVisualizarAluno.abrir();
    }



}
