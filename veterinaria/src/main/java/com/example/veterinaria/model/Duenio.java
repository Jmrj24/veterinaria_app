package com.example.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idDuenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    @OneToOne
    @JoinColumn(name="id_mascota", referencedColumnName="idMascota")
    private Mascota masco;

    public Duenio() {
    }

    public Duenio(Long idDuenio, String dni, String nombre, String apellido, String celular, Mascota masco) {
        this.idDuenio = idDuenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.masco = masco;
    }
}