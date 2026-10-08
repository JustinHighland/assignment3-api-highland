package com.example.assignment3.characters;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SciFiCharacterRepository extends JpaRepository<SciFiCharacter, Long> {

    List<SciFiCharacter> findByFranchiseIgnoreCase(String franchise);

    List<SciFiCharacter> findByNameContainingIgnoreCase(String name);

    List<SciFiCharacter> findByNameContainingIgnoreCaseAndFranchiseIgnoreCase(String name, String franchise);
}