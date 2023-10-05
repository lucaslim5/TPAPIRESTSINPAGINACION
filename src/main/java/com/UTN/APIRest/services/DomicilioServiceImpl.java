package com.UTN.APIRest.services;

import com.UTN.APIRest.entities.Domicilio;
import com.UTN.APIRest.repositories.BaseRepository;
import com.UTN.APIRest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }

}
