package com.pet.softwaresim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private int x = 0;

    @GetMapping("/home")
    public String greet(Model model) {
        model.addAttribute("message", String.valueOf(x));
        return "index";
    }

    @PostMapping("/home")
    public String incr(Model model) {
        x++;
        model.addAttribute("message", String.valueOf(x));
        return "index";
    }

    @PostMapping("/clear")
    public String clear(Model model) {
        x = 0;
        model.addAttribute("message", String.valueOf(x));
        return "index";
    }
}
