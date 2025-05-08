package com.acorn.day1prac.실습;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StarPrint {
	
    @GetMapping("/star")
    public String starprint(@RequestParam(defaultValue = "0") int cnt, Model model) {
        model.addAttribute("cnt", cnt);
        return "star";
    }
}
