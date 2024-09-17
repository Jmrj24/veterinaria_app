package com.example.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    public Mascota() {
    }

    public Mascota(Long idMascota, String nombre, String especie, String raza, String color) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
