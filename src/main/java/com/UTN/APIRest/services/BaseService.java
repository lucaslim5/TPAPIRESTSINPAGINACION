package com.UTN.APIRest.services;

import com.UTN.APIRest.entities.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntidad,ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID Id,E entity) throws Exception;

    public boolean delete(ID id) throws Exception;

}
