package com.skasetty.springbootpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);

}
