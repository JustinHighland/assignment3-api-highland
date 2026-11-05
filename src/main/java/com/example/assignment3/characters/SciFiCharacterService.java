package com.example.assignment3.characters;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SciFiCharacterService {
    private final SciFiCharacterRepository repository;

    public SciFiCharacterService(SciFiCharacterRepository repository) {
        this.repository = repository;
    }

    public List<SciFiCharacter> findAll(){
        return repository.findAll();
    }

    public List<SciFiCharacter> search(String name, String franchise){
        boolean hasName = name != null && !name.isBlank();
        boolean hasFranchise = franchise != null && !franchise.isBlank();

        if (hasName && hasFranchise){
            return repository.findByNameContainingIgnoreCaseAndFranchiseIgnoreCase(name.trim(), franchise.trim());
        }
        if (hasName){
            return repository.findByNameContainingIgnoreCase(name.trim());
        }
        if (hasFranchise){
            return repository.findByFranchiseIgnoreCase(franchise.trim());
        }

        return repository.findAll();
    }

    public SciFiCharacter findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CharacterNotFoundException(id));
    }

    public SciFiCharacter create(SciFiCharacter sciFiCharacter) {
        return repository.save(sciFiCharacter);
    }

public SciFiCharacter update(Long id, SciFiCharacter updated) {

    SciFiCharacter existing = findById(id);

    if (updated.getName() != null && !updated.getName().isBlank()) {
        existing.setName(updated.getName());
    }

    if (updated.getFranchise() != null && !updated.getFranchise().isBlank()) {
        existing.setFranchise(updated.getFranchise());
    }

    if (updated.getDescription() != null && !updated.getDescription().isBlank()) {
        existing.setDescription(updated.getDescription());
    }

    if (updated.getSpecies() != null && !updated.getSpecies().isBlank()) {
        existing.setSpecies(updated.getSpecies());
    }

    if (updated.getAbilities() != null && !updated.getAbilities().isBlank()) {
        existing.setAbilities(updated.getAbilities());
    }

    if (updated.getFirstAppearance() != null && !updated.getFirstAppearance().isBlank()) {
        existing.setFirstAppearance(updated.getFirstAppearance());
    }

    if (updated.getPersonalityTraits() != null && !updated.getPersonalityTraits().isBlank()) {
        existing.setPersonalityTraits(updated.getPersonalityTraits());
    }

    if (updated.getImageUrl() != null && !updated.getImageUrl().isBlank()) {
        existing.setImageUrl(updated.getImageUrl());
    }

    return repository.save(existing);
}

    public void delete(Long id) {
        findById(id); // throws 404 if missing
        repository.deleteById(id);
    }
}
