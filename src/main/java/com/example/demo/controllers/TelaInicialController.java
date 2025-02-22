package com.example.demo.controllers;

import com.example.demo.telas.TelaTreinos;
import com.example.demo.telas.TelaVisualizarTreino;
import com.example.demo.telas.frequencia.TelaVisualizarFrequencia;
import javafx.fxml.FXML;
import com.example.demo.telas.TelaAdicionarTreino;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaTreinos telaTreinos;
    private TelaAdicionarTreino telaAdicionarTreino;
    private TelaTreinos telaAtualizarTreino;
    private TelaVisualizarTreino telaVisualizarTreino;
    private TelaVisualizarFrequencia telaVisualizarFrequencia;

    public TelaInicialController(TelaVisualizarFrequencia telaVisualizarFrequencia, TelaTreinos telaTreinos, TelaAdicionarTreino telaAdicionarTreino, TelaTreinos telaAtualizarTreino, TelaVisualizarTreino telaVisualizarTreino) {

        this.telaVisualizarFrequencia = telaVisualizarFrequencia;
        this.telaTreinos = telaTreinos;
        this.telaAdicionarTreino = telaAdicionarTreino;
        this.telaAtualizarTreino = telaAtualizarTreino;
        this.telaVisualizarTreino = telaVisualizarTreino;

    }

    @FXML
    protected void onAbrirFrequenciaButtonClick() {
        telaVisualizarFrequencia.abrir();
    }

    @FXML
    protected void onAbrirTreinosButtonClick() {
        telaTreinos.abrir();
    }

    @FXML
    protected void onVisualizarTreinoButtonClick(){
        telaVisualizarTreino.abrir();
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
