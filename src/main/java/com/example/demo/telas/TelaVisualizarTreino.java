package com.example.demo.telas;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaVisualizarTreino {

    AbridorJanela abridorJanela;

    public TelaVisualizarTreino(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/treino/visualizar-treino-view.fxml", "Visualizar Treino", 350, 500);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }
}
