package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping()
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        String unicodeSmile = "\uD83D\uDE0A";
        String unicodeDance = "\uD83D\uDC83";
        messages.add("Hello!");
        messages.add("I'm Spring Boot + MVC application");
        messages.add("Finally" + unicodeDance + unicodeSmile + unicodeDance);
        model.addAttribute("messages", messages);
        return "index";
    }
}