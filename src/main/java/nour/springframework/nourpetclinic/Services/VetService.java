package nour.springframework.nourpetclinic.Services;

import nour.springframework.nourpetclinic.Model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet > findAll();
}
