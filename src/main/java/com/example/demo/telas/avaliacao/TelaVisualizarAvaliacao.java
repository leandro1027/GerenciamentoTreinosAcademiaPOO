package com.example.demo.telas.avaliacao;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaVisualizarAvaliacao {

    AbridorJanela abridorJanela;

    public TelaVisualizarAvaliacao(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/visualizar-avaliacao-view.fxml", "Atualizar Treinos", 350, 500);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }

}

