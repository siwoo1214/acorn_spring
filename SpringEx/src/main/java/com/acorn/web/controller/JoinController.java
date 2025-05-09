package com.acorn.web.controller;

import com.acorn.web.dto.User;
import com.acorn.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JoinController {

    @Autowired
    private UserService service;

    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String join(User user, Model model) {
        boolean result = service.join(user);
        if (result) {
            return "redirect:/login";
        } else {
            model.addAttribute("msg", "이미 존재하는 아이디입니다.");
            return "join";
        }
    }
}
