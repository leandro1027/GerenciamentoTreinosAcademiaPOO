package com.example.demo.telas.aluno;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaAlunosInicial {

    AbridorJanela abridorJanela;

    public TelaAlunosInicial(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir() {
        abridorJanela.abrirNovaJanela("views/aluno/aluno-inicial-view.fxml","Alunos", 700, 500);
    }

    public FXMLLoader getLoader() {
        return abridorJanela.getFxmlLoader();
    }
}
