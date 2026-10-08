package com.example.assignment3.characters;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/characters")

public class SciFiCharacterController {

    private final SciFiCharacterService service;

    public SciFiCharacterController(SciFiCharacterService service){
        this.service = service;
    }

    @GetMapping
    public List<SciFiCharacter> list(@RequestParam(required = false) String name,
            @RequestParam(required = false) String franchise) {
        return service.search(name, franchise);
    }

    @GetMapping("/{id}")
    public SciFiCharacter get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SciFiCharacter create(@Valid @RequestBody SciFiCharacter sciFiCharacter) {
        return service.create(sciFiCharacter);
    }

    @PutMapping("/{id}")
    public SciFiCharacter update(@PathVariable Long id, @Valid @RequestBody SciFiCharacter sciFiCharacter) {
        return service.update(id, sciFiCharacter);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
