package com.UTN.APIRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persona")
public class Persona extends BaseEntidad {
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="domicilio_id")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name="persona-libro",
            joinColumns = @JoinColumn(name ="persona_id"),
            inverseJoinColumns = @JoinColumn(name="libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
