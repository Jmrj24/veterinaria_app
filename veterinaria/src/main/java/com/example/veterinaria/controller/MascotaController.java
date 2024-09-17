package com.example.veterinaria.controller;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascoServi;

    // Lectura
    @GetMapping("/mascota/traertodos")
    public List<Mascota> getMascotas() {
        return mascoServi.getMascotas();
    }

    // Alta
    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco) {
        mascoServi.saveMascota(masco);
        return "La mascota se creó de manera exitosa!";
    }

    //Baja
    @DeleteMapping("/mascota/borrar/{id}")
    public String deleteMascota(@PathVariable Long id) {
        mascoServi.deleteMascota(id);
        return "Mascota borrada de forma exitosa!";
    }

    // Modificacion
    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota masco) {
        mascoServi.editMascota(masco);
        return mascoServi.findMascota(masco.getIdMascota());
    }

    // Listado de mascotas especie "perro" y raza "caniche"
    @GetMapping("/mascotas/perro/caniche")
    public List<Mascota> getMascotasPeCa() {
        return mascoServi.getMascotasPeCa();
    }
}