package com.UTN.APIRest.controllers;

import com.UTN.APIRest.entities.Persona;
import com.UTN.APIRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {



}
