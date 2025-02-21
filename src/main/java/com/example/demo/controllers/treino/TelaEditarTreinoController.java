package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaEditarTreinoController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCarga;

    @FXML
    private TextField txtRepeticoes;

    private Treino treino;

    // Método para configurar o treino que será editado
    public void setTreino(Treino treino) {
        this.treino = treino;
        // Preencher os campos com os dados do treino
        txtNome.setText(treino.getNome());
        txtCarga.setText(treino.getCarga());
        txtRepeticoes.setText(treino.getRepeticao());
    }

    // Outros métodos para editar o treino podem ser adicionados aqui
}
