package com.example.veterinaria.controller;

import com.example.veterinaria.dto.MascoDueDTO;
import com.example.veterinaria.model.Duenio;
import com.example.veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    @Autowired
    private IDuenioService dueServi;

    // Lectura
    @GetMapping("/duenio/traertodos")
    public List<Duenio> getDuenios() {
        return dueServi.getDuenios();
    }

    // Alta
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio due) {
        dueServi.saveDuenio(due);
        return "Dueño creado exitosamente!";
    }

    // Baja
    @DeleteMapping("/duenio/borrar/{id}")
    public String deleteDuenio(@PathVariable Long id) {
        dueServi.deleteDuenio(id);
        return "Dueño eliminado exitosamente!";
    }

    // Modificacion
    @PutMapping("duenio/editar")
    public Duenio editDuenio(@RequestBody Duenio due) {
        dueServi.editDuenio(due);
        return dueServi.findDuenio(due.getIdDuenio());
    }

    // DTO datos conjuntos de mascota y dueño
    @GetMapping("/duenio/mascota")
    public MascoDueDTO mascoDueDTO(@RequestParam(name="id") Long idDuenio) {
        return dueServi.mascoDueDTO(idDuenio);
    }
}
