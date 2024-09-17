package com.example.veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascoDueDTO {
    private String nombreMascota;
    private String especieMascota;
    private String razaMascota;
    private String nombreDuenio;
    private String apellidoDuenio;

    public MascoDueDTO() {
    }

    public MascoDueDTO(String nombreMascota, String especieMascota, String razaMascota, String nombreDuenio, String apellidoDuenio) {
        this.nombreMascota = nombreMascota;
        this.especieMascota = especieMascota;
        this.razaMascota = razaMascota;
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
    }
}
