package com.example.demo.repositories;

import com.example.demo.entities.Treino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends CrudRepository<Treino, Long> {
    // Métodos adicionais, se necessário
}