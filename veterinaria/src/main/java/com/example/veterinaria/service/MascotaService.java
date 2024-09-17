package com.example.veterinaria.service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long idMascota) {
        mascoRepo.deleteById(idMascota);
    }

    @Override
    public Mascota findMascota(Long idMascota) {
        return mascoRepo.findById(idMascota).orElse(null);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> getMascotasPeCa() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaMascotasPeCa = new ArrayList<>();

        for(Mascota masco:listaMascotas) {
            if(masco.getEspecie().equalsIgnoreCase("perro")) {
                if(masco.getRaza().equalsIgnoreCase("caniche")) {
                    listaMascotasPeCa.add(masco);
                }
            }
        }
        return listaMascotasPeCa;
    }
}