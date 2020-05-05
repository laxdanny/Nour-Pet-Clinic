package nour.springframework.nourpetclinic.Services;

import nour.springframework.nourpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
