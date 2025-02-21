package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.services.TreinoService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

public class TelaEditarTreinoController {

    @FXML
    private TextField txtNome, txtCarga, txtRepeticoes;


    private TreinoService treinoService;

    private Treino treino; // O treino que será editado

    public void setTreino(Treino treino) {
        this.treino = treino;
        txtNome.setText(treino.getNome());
        txtCarga.setText(treino.getCarga());
        txtRepeticoes.setText(treino.getRepeticao());
    }

    @FXML
    private void onSalvarButtonClick() {
        try {
            // Atualizar os dados do treino com os valores inseridos
            treino.setNome(txtNome.getText());
            treino.setCarga(txtCarga.getText());
            treino.setRepeticao(txtRepeticoes.getText());

            // Salvar no banco de dados
            treinoService.editarTreino(treino);

            // Fechar a tela de edição após salvar
            // Aqui você pode adicionar o código para fechar a janela

        } catch (NumberFormatException e) {
            showAlert("Erro", "Por favor, insira valores válidos para os campos numéricos.");
        }
    }

    @FXML
    private void onCancelarButtonClick() {
        // Aqui você pode adicionar código para fechar a janela sem salvar
    }

    private void showAlert(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
