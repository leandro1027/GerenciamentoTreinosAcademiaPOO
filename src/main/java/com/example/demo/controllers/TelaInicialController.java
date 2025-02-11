package com.example.demo.controllers;

import com.example.demo.telas.TelaTreinos;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaTreinos telaTreinos;
    private TelaTreinos telaAdicionarTreino;
    private TelaTreinos telaAtualizarTreino;
    private TelaTreinos telaVisualizarTreino;

    public TelaInicialController(TelaTreinos telaTreinos, TelaTreinos telaAdicionarTreino,
                                 TelaTreinos telaAtualizarTreino, TelaTreinos telaVisualizarTreino) {
        this.telaTreinos = telaTreinos;
        this.telaAdicionarTreino = telaAdicionarTreino;
        this.telaAtualizarTreino = telaAtualizarTreino;
        this.telaVisualizarTreino = telaVisualizarTreino;

    }

    @FXML
    protected void onAbrirTreinosButtonClick() {
        telaTreinos.abrir();
    }

    @FXML
    protected void onNovoTreinoButtonClick(){
        telaAdicionarTreino.abrir();
    }

    @FXML
    protected void onExcluirTreinoButtonClick(){
        telaAtualizarTreino.abrir();
    }

    @FXML
    protected void onEditarTreinoButtonClick(){
        telaVisualizarTreino.abrir();
    }



}
