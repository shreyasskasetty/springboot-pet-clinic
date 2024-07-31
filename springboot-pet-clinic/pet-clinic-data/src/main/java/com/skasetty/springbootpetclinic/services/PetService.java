package com.skasetty.springbootpetclinic.services;

import com.skasetty.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
