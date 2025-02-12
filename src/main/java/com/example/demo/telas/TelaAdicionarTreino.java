package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaAdicionarTreino{

    AbridorJanela abridorJanela;

    public TelaAdicionarTreino(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/treino/adicionar-treino-view.fxml", "Adicionar Treino", 300, 300);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }

}
