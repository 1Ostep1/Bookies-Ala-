package com.ostep.bookies.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String LogIn(Model model) {
        model.addAttribute("title", "Bookies");
        return "/login";
    }
}