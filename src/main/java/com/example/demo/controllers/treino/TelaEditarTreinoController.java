package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.repositories.TreinoRepository;
import com.example.demo.services.TreinoService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class  TelaEditarTreinoController {

    @FXML
    private TextField txtNome, txtCarga, txtRepeticoes;

    private TreinoService treinoService;

    private Treino treino;

    @Autowired
    private TreinoRepository treinoRepository;

    public void setTreino(Treino treino) {
        this.treino = treino;
        txtCarga.setText(treino.getCarga());
        txtRepeticoes.setText(treino.getRepeticao());
    }

    @FXML
    private void onSalvarButtonClick() {
        treino.setCarga(txtCarga.getText());
        treino.setRepeticao(txtRepeticoes.getText());
        treinoRepository.save(treino);

        txtRepeticoes.clear();
        txtCarga.clear();

        showAlertSalvar("Salvar", "Treino atualizado com sucesso!");
    }

    @FXML
    private void onCancelarButtonClick() {
    }

    private void showAlertSalvar(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void showAlert(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
