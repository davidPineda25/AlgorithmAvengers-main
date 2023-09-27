package com.algoritms.avengers.senasoft.repository;

import com.algoritms.avengers.senasoft.model.MotivosDesercion;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivosRepository extends ListCrudRepository<MotivosDesercion, Integer> {
}
