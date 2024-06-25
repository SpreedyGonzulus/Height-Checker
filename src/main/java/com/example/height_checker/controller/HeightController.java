package com.example.height_checker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeightController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/check-height")
    public String checkHeight(@RequestParam("height") int height, Model model) {
        String result;
        if (height < 170) {
            result = "niski";
        } else if (height <= 181) {
            result = "normalny";
        } else {
            result = "wysoki";
        }
        model.addAttribute("result", result);
        return "index";
    }
}
