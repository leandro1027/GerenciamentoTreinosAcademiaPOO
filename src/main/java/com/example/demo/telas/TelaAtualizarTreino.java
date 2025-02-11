package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaAtualizarTreino {

    AbridorJanela abridorJanela;

    public TelaAtualizarTreino(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/aluno/tela-atualizar-aluno-view.fxml", "Atualizar Treinos", 300, 300);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }

}
