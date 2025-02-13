package com.example.demo.controllers.treino;

import com.example.demo.entities.Treino;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.repositories.TreinoRepository;
import com.example.demo.telas.TelaAdicionarTreino;
import com.example.demo.telas.TelaPreencherTreino;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;



@Controller
public class TelaPreencherTreinoController {

    @FXML
    private TextField repeticoesTextField;

    @FXML
    private  TextField cargaTextField;

    @FXML
    private Label mensagemLabel;


    private TreinoRepository treinoRepository;

    private TelaPreencherTreino telaPreencherTreino;

    public TelaPreencherTreinoController(TelaPreencherTreino telaPreencherTreino, TreinoRepository treinoRepository) {
        this.telaPreencherTreino = telaPreencherTreino;
        this.treinoRepository = treinoRepository;
    }


    public void Cancelar(ActionEvent actionEvent) {
    }

    @FXML
    protected void onSalvarButtonClick() {
        Treino treino = new Treino();
        treino.setRepeticao(repeticoesTextField.getText());
        treino.setCarga(cargaTextField.getText());
        treinoRepository.save(treino);

        repeticoesTextField.clear();
        cargaTextField.clear();
        mensagemLabel.setText("Treino salvo com sucesso!");
    }
}
