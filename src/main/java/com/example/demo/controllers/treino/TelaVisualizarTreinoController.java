package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

@Controller
public class TelaVisualizarTreinoController {


    @FXML
    private Label labelNome;

    @FXML
    private Label labelCarga;

    @FXML
    private Label labelRepeticoes;

    @FXML
    private Label labelDataTreino;

    @FXML
    private Label labelDescricao;

    @FXML
    private Label labelDuracao;

    // Método para definir o treino e preencher as informações na tela
    public void setTreino(Treino treino) {
        labelNome.setText(treino.getNome());
        labelCarga.setText(treino.getCarga());
        labelRepeticoes.setText(treino.getRepeticao());
        labelDataTreino.setText(treino.getDatatreino().toString());
        labelDescricao.setText(treino.getDescricao());
        labelDuracao.setText(treino.getDuracao() + " minutos");
    }

    // Ação do botão Fechar
    @FXML
    private void onFecharButtonClick() {
        labelNome.getScene().getWindow().hide();
    }
}

