package com.example.assignment3.characters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
public String gallery(
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String franchise,
        Model model) {

    model.addAttribute("characters", service.search(name, franchise));
    model.addAttribute("searchName", name);
    model.addAttribute("searchFranchise", franchise);

    return "index";

}

@GetMapping("/characters/new")
public String showAddForm() {
    return "new-character-form";
}

@PostMapping("/characters")
public String addCharacter(
        @ModelAttribute SciFiCharacter character,
        RedirectAttributes redirectAttributes) {

    service.create(character);

    redirectAttributes.addFlashAttribute(
            "successMessage", "Character added successfully!");

    return "redirect:/";
}

@GetMapping("/characters/{id}/edit")
public String showEditForm(@PathVariable long id, Model model) {

    SciFiCharacter character = service.findById(id);

    model.addAttribute("myChar", character);

    return "edit-character";
}

@PostMapping("/characters/{id}")
public String updateCharacter(
        @PathVariable long id,
        @ModelAttribute SciFiCharacter character,
        RedirectAttributes redirectAttributes) {

    service.update(id, character);

    redirectAttributes.addFlashAttribute(
            "successMessage", "Character updated successfully!");

    return "redirect:/characters/" + id;
}
    
}
