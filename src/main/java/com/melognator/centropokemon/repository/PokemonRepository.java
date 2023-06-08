package com.melognator.centropokemon.repository;

import com.melognator.centropokemon.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {}
