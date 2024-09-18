package com.example.veterinaria.service;

import com.example.veterinaria.dto.MascoDueDTO;
import com.example.veterinaria.model.Duenio;
import com.example.veterinaria.repository.IDuenioRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {
    @Autowired
    private IDuenioRepository dueRepo;

    @Override
    public List<Duenio> getDuenios() {
        return dueRepo.findAll();
    }

    @Override
    public void saveDuenio(Duenio due) {
        dueRepo.save(due);
    }

    @Override
    public void deleteDuenio(Long idDuenio) {
        dueRepo.deleteById(idDuenio);
    }

    @Override
    public Duenio findDuenio(Long idDuenio) {
        return dueRepo.findById(idDuenio).orElse(null);
    }

    @Override
    public void editDuenio(Duenio due) {
        this.saveDuenio(due);
    }

    @Override
    public List<MascoDueDTO> listaMascoDueDTO() {
        List<Duenio> listaDuenios = this.getDuenios();
        List<MascoDueDTO> listaMascoDue = new ArrayList<>();

        MascoDueDTO mascoDue = new MascoDueDTO();
        for(Duenio due:listaDuenios) {
            mascoDue.setNombreMascota(due.getMasco().getNombre());
            mascoDue.setEspecieMascota(due.getMasco().getEspecie());
            mascoDue.setRazaMascota(due.getMasco().getRaza());
            mascoDue.setNombreDuenio(due.getNombre());
            mascoDue.setApellidoDuenio(due.getApellido());

            listaMascoDue.add(mascoDue);
            mascoDue = new MascoDueDTO();
        }
        return listaMascoDue;
    }
}