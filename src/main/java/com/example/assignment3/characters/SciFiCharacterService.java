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
        existing.setName(updated.getName());
        existing.setFranchise(updated.getFranchise());
        existing.setDescription(updated.getDescription());
        existing.setSpecies(updated.getSpecies());

        return repository.save(existing);
     }

    public void delete(Long id) {
        findById(id); // throws 404 if missing
        repository.deleteById(id);
    }
}
