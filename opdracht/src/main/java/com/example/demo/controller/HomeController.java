package com.example.demo.controller;

import com.example.demo.model.*;

import com.example.demo.service.stringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    stringService StringService;

    String reverse;

    @GetMapping("/begin")
    public String createForm(Model model) {

        model.addAttribute("form", new Form());
        return "home";
    }

    @PostMapping("/omdraaien")
    public String omdraaienForm(@ModelAttribute Form form, Model model) {

        System.out.println("Input:" + form.getInputText());

        reverse = "Woord omgedraaid: " + StringService.reverse(form.getInputText());

        model.addAttribute("reverse", reverse);

        return "home";
    }

    @PostMapping("/tellen")
    public String countWordsForm(@ModelAttribute Form form, Model model) {

        String input = form.getInputText();

        System.out.println("Input:" + input);

        reverse = "Aantal woorden: " +  StringService.getCountByWords(input).countWords;

        model.addAttribute("reverse", reverse);

        return "home";
    }

}
