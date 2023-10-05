package com.UTN.APIRest.repositories;

import com.UTN.APIRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
