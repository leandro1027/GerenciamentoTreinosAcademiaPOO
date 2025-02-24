package com.example.demo.controllers.frequencia;

import com.example.demo.entities.Frequencia;
import com.example.demo.repositories.FrequenciaRepository;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TelaVisualizarFrequenciaController {

    @FXML
    private ListView<String> listViewFrequencias; // Lista para mostrar as frequências

    private final FrequenciaRepository frequenciaRepository;

    @Autowired
    public TelaVisualizarFrequenciaController(FrequenciaRepository frequenciaRepository) {
        this.frequenciaRepository = frequenciaRepository;
    }

    // Método chamado ao inicializar a tela
    @FXML
    public void initialize() {
        loadFrequencias(); // Carrega as frequências ao iniciar
    }

    private void loadFrequencias() {
        List<Frequencia> frequencias = frequenciaRepository.findAll();

        for (Frequencia frequencia : frequencias) {
            String info = "ID: " + frequencia.getId() + ", Data: " + frequencia.getDatafrequencia();
            listViewFrequencias.getItems().add(info);
        }
    }
}
