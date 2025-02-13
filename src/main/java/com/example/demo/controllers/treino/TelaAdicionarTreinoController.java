package com.example.demo.controllers.treino;

import com.example.demo.telas.TelaAdicionarTreino;
import com.example.demo.telas.TelaPreencherTreino;
import com.example.demo.telas.TelaTreinos;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaAdicionarTreinoController {

    private TelaPreencherTreino telaPreencherTreino;
    private TelaTreinos telaTreinos;
    private TelaAdicionarTreino telaAdicionarTreino;
    private TelaTreinos telaAtualizarTreino;
    private TelaTreinos telaVisualizarTreino;

    public TelaAdicionarTreinoController(TelaPreencherTreino telaPreencherTreino, TelaTreinos telaTreinos, TelaAdicionarTreino telaAdicionarTreino, TelaTreinos telaAtualizarTreino, TelaTreinos telaVisualizarTreino) {

        this.telaPreencherTreino = telaPreencherTreino;
        this.telaTreinos = telaTreinos;
        this.telaAdicionarTreino = telaAdicionarTreino;
        this.telaAtualizarTreino = telaAtualizarTreino;
        this.telaVisualizarTreino = telaVisualizarTreino;

    }

    @FXML
    protected void onPreencherTreinoButtonClick(){telaPreencherTreino.abrir();}

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




