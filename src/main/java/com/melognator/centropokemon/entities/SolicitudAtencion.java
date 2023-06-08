package com.melognator.centropokemon.entities;

import jakarta.persistence.*;

@Entity
public class SolicitudAtencion {

    public SolicitudAtencion() {
    }

    public SolicitudAtencion(Entrenador entrenador, Pokemon pokemon) {
        this.entrenador = entrenador;
        this.pokemon = pokemon;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Entrenador entrenador;

    @ManyToOne(cascade = CascadeType.ALL)
    private Pokemon pokemon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
