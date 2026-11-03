package com.example.assignment3.characters;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity 
@Table(name = "characters")
public class SciFiCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;

    @NotBlank
    private String name;


    @NotBlank
    private String description;

    @NotBlank
    private String franchise;

    @NotBlank
    private String species;

    @NotBlank 
    private String abilities;

    @NotBlank 
    private String firstAppearance;

    @NotBlank 
    private String personalityTraits;

    private String imageUrl;

    public SciFiCharacter() {

    }
    public SciFiCharacter(String name, String description, String franchise, String species, String abilities, String firstAppearance, String personalityTraits, String imageUrl){
        this.name = name;
        this.description = description;
        this.franchise = franchise;
        this.species = species;
        this.abilities = abilities;
        this.firstAppearance = firstAppearance;
        this.personalityTraits = personalityTraits;
        this.imageUrl = imageUrl;

    }

    public long getCharacterId(){
        return characterId;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getFranchise(){
        return franchise;
    }
    public String getSpecies(){
        return species;
    }
    public String getAbilities(){
        return abilities;
    }
    public String getPersonalityTraits(){
        return personalityTraits;
    }
    public String getFirstAppearance(){
        return firstAppearance;
    }
    public String getImageUrl(){
        return imageUrl;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setFranchise(String franchise){
        this.franchise = franchise;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setAbilities(String abilities){
        this.abilities = abilities;
    }
    public void setPersonalityTraits(String personalityTraits){
        this.personalityTraits = personalityTraits;
    }
    public void setFirstAppearance(String firstAppearance){
        this.firstAppearance = firstAppearance;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }




    
}
