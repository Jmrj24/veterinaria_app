package com.example.veterinaria.service;

import com.example.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {

    // Obtener todos los mascotas
    public List<Mascota> getMascotas();

    // Crear una mascota
    public void saveMascota(Mascota masco);

    // Borrar una mascota
    public void deleteMascota(Long idMascota);

    // Obtener una mascota
    public Mascota findMascota(Long idMascota);

    //Editar una mascota
    public void editMascota(Mascota masco);

    public List<Mascota> getMascotasPeCa();
}