package com.example.listsandforms.controllers;

import com.example.listsandforms.models.Something;
import com.example.listsandforms.utils.ListCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ValidateController {
    @Autowired
    private ListCreator listCreator;

    @PostMapping("/validate")
    public String validate(Model model, @RequestParam String name, @RequestParam String password){
        if (name.equals(password)){
            model.addAttribute("message", "Right!");

            ArrayList<Something> list = listCreator.getList();
            model.addAttribute("list", list);

            return "home/lists";
        }
        else {
            model.addAttribute("message", "Wrong!");
            return "home/login";
        }
    }
}