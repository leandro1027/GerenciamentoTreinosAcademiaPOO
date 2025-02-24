package com.example.demo.repositories;

import com.example.demo.entities.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenciaRepository extends JpaRepository<Frequencia, Integer> {
    // Métodos de consulta personalizados, se necessário
}
