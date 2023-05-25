package com.karabiyik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    public String getTymeleaf1(Model model) {
        model.addAttribute("key_model", "modelden geldi");
        model.addAttribute("key_model2", "model2'den geldi");

        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model() {
        return "thymeleaf1";
    }

    @GetMapping("/thymeleaf3")
    public String getTymeleaf3(Model model) {
        model.addAttribute("key_model2", "model3'den geldi");

        return "thymeleaf3";
    }
}
