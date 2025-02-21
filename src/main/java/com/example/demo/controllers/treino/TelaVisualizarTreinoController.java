package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.services.TreinoService;
import com.example.demo.telas.TelaEditarTreino;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Alert;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class TelaVisualizarTreinoController {

    @FXML
    private ListView<String> listViewTreinos;

    @FXML
    private Button btnEditar, btnExcluir, btnFechar;

    @Autowired
    private TreinoService treinoService;

    private List<Treino> listaTreinos; // Guardar os treinos carregados
    @Autowired
    private TelaEditarTreino telaEditarTreino;

    @FXML
    public void initialize() {
        carregarTreinos();
        listViewTreinos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    private void carregarTreinos() {
        listaTreinos = treinoService.listarTodos();
        listViewTreinos.getItems().clear();

        for (Treino treino : listaTreinos) {
            String nome = (treino.getNome() != null) ? treino.getNome() : "Sem nome";
            String carga = (treino.getCarga() != null) ? treino.getCarga() + "kg" : "0kg";
            String repeticoes = (treino.getRepeticao() != null) ? treino.getRepeticao() + " reps" : "0 reps";

            listViewTreinos.getItems().add(nome + " - " + carga + ", " + repeticoes);
        }
    }

    @FXML
    private void onFecharButtonClick() {
        listViewTreinos.getScene().getWindow().hide();
    }

    @FXML
    private void onEditarButtonClick() {
        telaEditarTreino.abrir();
        int selectedIndex = listViewTreinos.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Treino treinoSelecionado = listaTreinos.get(selectedIndex);
            System.out.println("Editar treino: " + treinoSelecionado.getNome());
        } else {
            showAlert("Erro", "Selecione um treino para editar.");
        }
    }

    @FXML
    private void onExcluirButtonClick() {
        int selectedIndex = listViewTreinos.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Treino treinoSelecionado = listaTreinos.get(selectedIndex);
            treinoService.excluirTreino(treinoSelecionado.getId());
            carregarTreinos(); // Atualizar a lista após exclusão
            showAlertConfirma("Confirmação", "Você realmente quer excluir o treino?");
        } else {
            showAlert("Erro", "Selecione um treino para excluir.");
        }
    }

    private void showAlert(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();

    } private void showAlertConfirma(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
