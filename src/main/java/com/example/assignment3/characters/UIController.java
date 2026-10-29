package com.example.assignment3.characters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/characters")
public class UIController {

        private final SciFiCharacterService service;

    public UIController(SciFiCharacterService service){
        this.service = service;
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/{id}")
public String details(@PathVariable long id, Model model){
SciFiCharacter character = service.findById(id);
model.addAttribute("myChar", character);

    return "details";
}
    
}
