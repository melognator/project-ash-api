package com.melognator.centropokemon.controller;

import com.melognator.centropokemon.entities.Entrenador;
import com.melognator.centropokemon.entities.Pokemon;
import com.melognator.centropokemon.entities.SolicitudAtencion;
import com.melognator.centropokemon.services.SolicitudAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitudes")
@CrossOrigin("*")
public class SolicitudAtencionController {

    @Autowired
    private final SolicitudAtencionService solicitudAtencionService;

    public SolicitudAtencionController(SolicitudAtencionService solicitudAtencionService) {
        this.solicitudAtencionService = solicitudAtencionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitudAtencion> leer(@PathVariable Long id) {
        Optional<SolicitudAtencion> solicitud = solicitudAtencionService.leer(id);
        if (!solicitud.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(solicitud.get());
    }

    @GetMapping
    public ResponseEntity<List<SolicitudAtencion>> leerTodos() {
        List<SolicitudAtencion> solicitudes = solicitudAtencionService.leerTodos();
        return ResponseEntity.ok(solicitudes);
    }

    @PostMapping
    public ResponseEntity<SolicitudAtencion> crear(@RequestBody SolicitudAtencion s) {
        SolicitudAtencion solicitud = solicitudAtencionService.crear(s);
        return ResponseEntity.ok(solicitud);
    }

    @DeleteMapping
    public ResponseEntity<Object> borrar(@RequestParam Long id) {
        solicitudAtencionService.borrar(id);
        return ResponseEntity.ok("Borrado exitosamente.");
    }

}
