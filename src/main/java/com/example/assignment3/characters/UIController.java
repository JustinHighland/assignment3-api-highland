package com.example.assignment3.characters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class UIController {

        private final SciFiCharacterService service;

    public UIController(SciFiCharacterService service){
        this.service = service;
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/characters/{id}")
    public String details(@PathVariable long id, Model model){
    SciFiCharacter character = service.findById(id);
    model.addAttribute("myChar", character);

        return "details";
}

    @GetMapping("/")
    public String gallery(Model model) {
    model.addAttribute("characters", service.findAll());
        return "index";
}
    
}
