package nour.springframework.nourpetclinic.Services;

import nour.springframework.nourpetclinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet  save(Pet pet);
    Set<Pet > findAll();
}
