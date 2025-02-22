package com.example.demo.telas;

import com.example.demo.controllers.treino.TelaEditarTreinoController;
import com.example.demo.entities.Treino;
import com.example.demo.utils.AbridorJanela;
import javafx.fxml.FXMLLoader;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class TelaEditarTreino {
    AbridorJanela abridorJanela;

    TelaEditarTreinoController telaEditarTreinoController;

    @Getter
    @Setter
    private Treino selectedTreino;

    public TelaEditarTreino(AbridorJanela abridorJanela) {
        this.abridorJanela = abridorJanela;
    }

    public void abrir(){
        abridorJanela.abrirNovaJanela("/views/treino/editar-treino-view.fxml", "editar Treinos", 300, 300);
        telaEditarTreinoController = abridorJanela.getFxmlLoader().getController();
        telaEditarTreinoController.setTreino(selectedTreino);
    }

    public FXMLLoader getXMLLoader(){
        return abridorJanela.getFxmlLoader();
    }
}
