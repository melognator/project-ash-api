package com.melognator.centropokemon.services;

import com.melognator.centropokemon.entities.Entrenador;
import com.melognator.centropokemon.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorService {

    private final EntrenadorRepository entrenadorRepository;

    @Autowired
    public EntrenadorService(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    // crud
    public Entrenador crear(Entrenador e) {
        return entrenadorRepository.save(e);
    }

    public Entrenador leer(Long id) {
        return entrenadorRepository.getReferenceById(id);
    }

    public Entrenador modificar(Entrenador e) {
        return entrenadorRepository.save(e);
    }

    public void borrar(Long id) {
        entrenadorRepository.deleteById(id);
    }

}
