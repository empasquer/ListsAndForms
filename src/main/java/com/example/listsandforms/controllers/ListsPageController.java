package com.example.listsandforms.controllers;

import com.example.listsandforms.models.Something;
import com.example.listsandforms.utils.ListCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ListsPageController {
    @Autowired
    private ListCreator listCreator;

    @GetMapping("/lists")
    public String lists(Model model) {
        ArrayList<Something> list = listCreator.getList();
        model.addAttribute("list", list);
        return "home/lists";
    }
}
