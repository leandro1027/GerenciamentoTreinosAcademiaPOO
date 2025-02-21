package com.example.demo.controllers.treino;

import com.example.demo.telas.TelaAdicionarTreino;
import com.example.demo.telas.TelaPreencherTreino;
import com.example.demo.telas.TelaTreinos;
import com.example.demo.telas.TelaVisualizarTreino;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TelaAdicionarTreinoController {

    private TelaVisualizarTreino telaVisualizarTreino;
    private TelaPreencherTreino telaPreencherTreino;
    private TelaTreinos telaTreinos;
    private TelaAdicionarTreino telaAdicionarTreino;
    private TelaTreinos telaAtualizarTreino;



    public TelaAdicionarTreinoController(TelaPreencherTreino telaPreencherTreino, TelaTreinos telaTreinos, TelaAdicionarTreino telaAdicionarTreino, TelaTreinos telaAtualizarTreino, TelaVisualizarTreino telaVisualizarTreino) {
        this.telaPreencherTreino = telaPreencherTreino;
        this.telaTreinos = telaTreinos;
        this.telaAdicionarTreino = telaAdicionarTreino;
        this.telaAtualizarTreino = telaAtualizarTreino;
        this.telaVisualizarTreino = telaVisualizarTreino;
    }

    @FXML
    protected void onPreencherTreinoButtonClick(){telaPreencherTreino.abrir();}

    @FXML protected void onCancelarButtonClick(){telaTreinos.abrir();}


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

    @FXML
    protected void onVisualizarTreinoButtonClick(){
        telaVisualizarTreino.abrir();
    }

    @FXML
    private Label nomeTreino1;
    @FXML
    private Label nomeTreino2;

    public List<String> obterNomesTreinos() {
        List<String> nomesTreinos = new ArrayList<>();
        if (nomeTreino1 != null && !nomeTreino1.getText().isEmpty()) {
            nomesTreinos.add(nomeTreino1.getText());
        }
        if (nomeTreino2 != null && !nomeTreino2.getText().isEmpty()) {
            nomesTreinos.add(nomeTreino2.getText());
        }
        // Adicionar mais treinos aqui
        return nomesTreinos;
    }

}
