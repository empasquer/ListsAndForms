package com.example.listsandforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class FormsController {


    @GetMapping("/forms")
    public String forms(Model model) {


        return "/home/forms";
    }
}
