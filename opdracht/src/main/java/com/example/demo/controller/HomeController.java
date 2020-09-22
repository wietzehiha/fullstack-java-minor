package com.example.demo.controller;

import com.example.demo.model.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    String reverse;

    @GetMapping("/begin")
    public String createProjectForm(Model model) {

        model.addAttribute("form", new Form());
        return "home";
    }

    @PostMapping("/result")
    public String saveProjectSubmission(@ModelAttribute Form form, Model model) {

        System.out.println("Input:" + form.getInputText());

        reverse = stringController.reverse(form.getInputText());

        model.addAttribute("reverse", reverse);

        return "home";
    }
}
