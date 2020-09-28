package com.example.demo.controller;

import com.example.demo.model.Form;
import com.example.demo.service.stringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Profile("prod")
@Controller
public class HomeTwoController {
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
     * Make the string uppercase..
     */
    @PostMapping("/omdraaien")
    public String capsTheString(@ModelAttribute Form form, Model model) {
        reverse = "Woord in CAPS: " + StringService.wordsBigger(form.getInputText());
        model.addAttribute("reverse", reverse);

        return "home";
    }
}
