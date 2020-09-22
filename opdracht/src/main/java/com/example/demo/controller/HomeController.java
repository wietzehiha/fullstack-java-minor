package com.example.demo.controller;

import com.example.demo.model.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    String reverse;

    @GetMapping("/begin")
    public String createForm(Model model) {

        model.addAttribute("form", new Form());
        return "home";
    }

    @PostMapping("/omdraaien")
    public String omdraaienForm(@ModelAttribute Form form, Model model) {

        System.out.println("Input:" + form.getInputText());

        reverse = "Woord omgedraaid: " + stringController.reverse(form.getInputText());

        model.addAttribute("reverse", reverse);

        return "home";
    }

    @PostMapping("/tellen")
    public String countWordsForm(@ModelAttribute Form form, Model model) {

        System.out.println("Input:" + form.getInputText());

        reverse = "Aantal woorden: " + stringController.countWords(form.getInputText());

        model.addAttribute("reverse", reverse);

        return "home";
    }
}
