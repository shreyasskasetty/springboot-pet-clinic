package com.skasetty.springbootpetclinic.services;

import com.skasetty.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
