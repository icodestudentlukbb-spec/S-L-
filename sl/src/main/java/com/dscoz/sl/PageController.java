package com.dscoz.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
    @GetMapping("/projects")
    public String projects(Model model) {
        return "projects";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}