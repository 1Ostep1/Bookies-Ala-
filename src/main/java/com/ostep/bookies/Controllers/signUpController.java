package com.ostep.bookies.Controllers;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signUpController {

    @GetMapping("/")
    public String signUp(Model model) {
        model.addAttribute("title", "Bookies");
        return "signUp";
    }
}
