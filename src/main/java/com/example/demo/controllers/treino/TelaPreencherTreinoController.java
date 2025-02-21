package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.TreinoRepository;
import com.example.demo.telas.TelaAdicionarTreino;
import com.example.demo.telas.TelaPreencherTreino;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Date;
import java.util.List;


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

    @FXML
    private ComboBox<String> comboBoxTreinos;

    @Autowired
    private TreinoRepository treinoRepository;

    private TelaAdicionarTreinoController telaAdicionarTreinoController;
    @Autowired
    private TelaPreencherTreino telaPreencherTreino;

    public TelaPreencherTreinoController(TelaPreencherTreino telaPreencherTreino,
                                         TelaAdicionarTreinoController telaAdicionarTreinoController,
                                         TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
        this.telaAdicionarTreinoController = telaAdicionarTreinoController;
    }


    // Carrega os treinos no ComboBox
    private void carregarTreinos() {
        List<String> nomesTreinos = telaAdicionarTreinoController.obterNomesTreinos();
        System.out.println("Nomes de treinos carregados: " + nomesTreinos);  // Verificando os nomes de treinos
        if (nomesTreinos.isEmpty()) {
            mensagemLabel.setText("Nenhum treino encontrado.");
        } else {
            comboBoxTreinos.getItems().setAll(nomesTreinos);
        }
    }

    public void Cancelar(ActionEvent actionEvent) {

    }

    @FXML
    private void onSalvarButtonClick() {
        String treinoSelecionado = treinoComboBox.getSelectionModel().getSelectedItem();
        String repeticoes = repeticoesTextField.getText();
        String carga = cargaTextField.getText();

        if (treinoSelecionado == null || repeticoes.isEmpty() || carga.isEmpty()) {
            mensagemLabel.setText("Preencha todos os campos!");
        } else {
            Treino novoTreino = new Treino();
            novoTreino.setNome(treinoSelecionado);
            novoTreino.setRepeticao(repeticoes);
            novoTreino.setCarga(carga);
            novoTreino.setDatatreino(new Date());
            showAlert("Sucesso", "Exercicio salvo com sucesso!");
            treinoRepository.save(novoTreino);
        }
    }

    private void showAlert(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    // Inicialização do controlador
    @FXML
    public void initialize() {
        carregarTreinos();  // Carregar os treinos ao inicializar
        treinoComboBox.getItems().addAll(
                "Supino inclinado",
                "Leg Press 45º"
        );
    }

    // Ação de selecionar treino
    public void onTreinoSelecionado(ActionEvent actionEvent) {
        String treinoSelecionado = treinoComboBox.getSelectionModel().getSelectedItem();
        if (treinoSelecionado != null) {
            mensagemLabel.setText("Treino selecionado: " + treinoSelecionado);
        }
    }
}