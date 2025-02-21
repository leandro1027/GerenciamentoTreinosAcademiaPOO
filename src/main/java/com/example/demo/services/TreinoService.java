package com.example.demo.services;

import com.example.demo.entities.Treino;
import com.example.demo.repositories.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    // Método para listar todos os treinos
    public List<Treino> listarTodos() {
        return (List<Treino>) treinoRepository.findAll();
    }

    // Método para excluir um treino pelo ID
    public void excluirTreino(Integer id) {
        treinoRepository.deleteById(id);
    }

    public void editarTreino(Treino treinoAtualizado) {
        treinoRepository.save(treinoAtualizado);
    }
}
