package com.skasetty.springbootpetclinic.services;

import com.skasetty.springbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
