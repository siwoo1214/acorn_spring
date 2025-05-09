package com.acorn.web.controller;

import javax.servlet.http.HttpSession;

import com.acorn.web.dto.User;
import com.acorn.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
	
	@Autowired
    private UserService service;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String id,
                        String password,
                        HttpSession session,
                        Model model) {
        User user = service.login(id, password);
        if (user != null) {
            session.setAttribute("loginUser", user);
            session.setMaxInactiveInterval(1800);
            return "home";
        } else {
            model.addAttribute("msg", "로그인 실패: 아이디 또는 비밀번호가 틀렸습니다.");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
