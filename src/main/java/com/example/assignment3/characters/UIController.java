package com.example.assignment3.characters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/characters")
public class UIController {


    @GetMapping("/about")
    public String about(){
        return "about";
    }
    
}
