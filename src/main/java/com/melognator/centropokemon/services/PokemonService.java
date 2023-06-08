package com.melognator.centropokemon.services;

import com.melognator.centropokemon.entities.Pokemon;
import com.melognator.centropokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    // crud
    public Pokemon crear(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public Pokemon leer(Long id) {
        return pokemonRepository.getReferenceById(id);
    }

    public Pokemon modificar(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void borrar(Long id) {
        pokemonRepository.deleteById(id);
    }

}
