package com.example.demo.repositories;

import com.example.demo.entities.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenciaRepository extends CrudRepository<Aluno, Integer> { }
