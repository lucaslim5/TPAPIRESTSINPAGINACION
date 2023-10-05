package com.UTN.APIRest.controllers;

import com.UTN.APIRest.entities.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidad, ID extends Serializable>{
    public ResponseEntity<?> getAll() throws Exception;
    public ResponseEntity<?> getOne(@PathVariable ID id) throws Exception;
    public ResponseEntity<?> save(@RequestBody E entity) throws Exception;
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity) throws Exception;
    public ResponseEntity<?> delete(@PathVariable ID id) throws Exception;
}
