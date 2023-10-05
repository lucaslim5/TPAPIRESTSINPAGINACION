package com.UTN.APIRest.repositories;

import com.UTN.APIRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
