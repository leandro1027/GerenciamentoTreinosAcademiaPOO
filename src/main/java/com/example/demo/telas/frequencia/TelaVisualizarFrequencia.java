package com.example.demo.telas.frequencia;

import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import org.springframework.stereotype.Component;

@Component
public class TelaVisualizarFrequencia {

    AbridorJanela abridorJanela;

    public TelaVisualizarFrequencia(AbridorJanela abridorJanela) {this.abridorJanela = abridorJanela;}

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/visualizar-frequencia-view.fxml", "Visualizar frequência", 350, 500);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }
}
