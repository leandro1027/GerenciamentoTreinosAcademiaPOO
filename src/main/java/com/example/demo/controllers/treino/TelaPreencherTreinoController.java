package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.TreinoRepository;
import com.example.demo.telas.TelaAdicionarTreino;
import com.example.demo.telas.TelaPreencherTreino;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;



@Controller
public class TelaPreencherTreinoController {

    @FXML
    private TextField repeticoesTextField;

    @FXML
    private TextField cargaTextField;

    @FXML
    private Label mensagemLabel;

    @FXML
    private ComboBox<String> treinoComboBox;

    private TreinoRepository treinoRepository;


    public TelaPreencherTreinoController(TelaPreencherTreino telaPreencherTreino, TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }


    public void Cancelar(ActionEvent actionEvent) {
    }

    @FXML
    protected void onSalvarButtonClick() {
        try {
            Treino treino = new Treino();
            treino.setRepeticao(repeticoesTextField.getText());
            treino.setCarga(cargaTextField.getText());
            treinoRepository.save(treino);

            repeticoesTextField.clear();
            cargaTextField.clear();
            mensagemLabel.setText("Treino salvo com sucesso!");
        } catch (Exception e) {
            mensagemLabel.setText("Erro ao salvar o treino: " + e.getMessage());
        }
    }

    @FXML
    public void initialize() {
        treinoComboBox.getItems().addAll(
                "Treino A - Peito e Tríceps",
                "Treino B - Costas e Bíceps",
                "Treino C - Pernas e Ombros"
        );
    }

    public void onTreinoSelecionado(ActionEvent actionEvent) {
        String treinoSelecionado = treinoComboBox.getSelectionModel().getSelectedItem();
        if (treinoSelecionado != null) {
            mensagemLabel.setText("Treino selecionado: " + treinoSelecionado);
        }
    }
}

