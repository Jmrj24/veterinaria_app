package com.example.veterinaria.service;

import com.example.veterinaria.dto.MascoDueDTO;
import com.example.veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    // Obtener todos los dueños
    public List<Duenio> getDuenios();

    // Crear un dueño
    public void saveDuenio(Duenio due);

    // Borrar un dueño
    public void deleteDuenio(Long idDuenio);

    // Obtener un dueño
    public Duenio findDuenio(Long idDuenio);

    //Editar un dueño
    public void editDuenio(Duenio due);

    public MascoDueDTO mascoDueDTO(Long idDuenio);
}