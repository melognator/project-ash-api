package com.melognator.centropokemon.services;

import com.melognator.centropokemon.entities.SolicitudAtencion;
import com.melognator.centropokemon.repository.SolicitudAtencionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudAtencionService {

    private final SolicitudAtencionRepository solicitudAtencionRepository;

    @Autowired
    public SolicitudAtencionService(SolicitudAtencionRepository solicitudAtencionRepository) {
        this.solicitudAtencionRepository = solicitudAtencionRepository;
    }

    // crud
    public SolicitudAtencion crear(SolicitudAtencion solicitud) {
        return solicitudAtencionRepository.save(solicitud);
    }

    public SolicitudAtencion modificar(SolicitudAtencion solicitud) {
        return solicitudAtencionRepository.save(solicitud);
    }

    public Optional<SolicitudAtencion> leer(Long id) {
        return solicitudAtencionRepository.findById(id);
    }

    public List<SolicitudAtencion> leerTodos() {
        return solicitudAtencionRepository.findAll();
    }

    public void borrar(Long id) {
        solicitudAtencionRepository.deleteById(id);
    }


}
