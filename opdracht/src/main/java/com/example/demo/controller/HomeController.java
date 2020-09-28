package com.example.demo.controller;

import com.example.demo.model.*;

import com.example.demo.service.stringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Profile("dev")
@Controller
public class HomeController {

    @Autowired
    stringService StringService;

    String reverse;


    /*
     * Create a new Form model. With the mapping of "/begin"
     */
    @GetMapping("/begin")
    public String createForm(Model model) {
        model.addAttribute("form", new Form());
        return "home";
    }

    /*
     * url: "/omdraaien"
     * The given String been transferd to the string reversed.
     */
    @PostMapping("/omdraaien")
    public String omdraaienForm(@ModelAttribute Form form, Model model) {
        reverse = "Woord omgedraaid: " + StringService.reverse(form.getInputText());
        model.addAttribute("reverse", reverse);

        return "home";
    }

    /*
     * url: "/tellen"
     * Count the words in the string.
     */
    @PostMapping("/tellen")
    public String countWordsForm(@ModelAttribute Form form, Model model) {
        String input = form.getInputText();
        reverse = "Aantal woorden: " +  StringService.getCountByWords(input).countWords;
        model.addAttribute("reverse", reverse);

        return "home";
    }

}

