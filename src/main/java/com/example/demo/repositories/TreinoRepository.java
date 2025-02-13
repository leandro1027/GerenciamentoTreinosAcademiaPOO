package com.example.demo.repositories;

import com.example.demo.entities.Treino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends CrudRepository<Treino, Integer> { // Alterado para Integer, que é o tipo de 'id' na entidade
    Treino findByNome(String nome);  // Mantido o nome do método para buscar treino pelo nome
    // Métodos adicionais, se necessário
}
