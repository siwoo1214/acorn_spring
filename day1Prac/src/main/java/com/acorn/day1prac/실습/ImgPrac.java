package com.acorn.day1prac.실습;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImgPrac {
	@GetMapping("/viewImg")
	public String viewImg(Model model) {
		String img = "messi.jpg";
		model.addAttribute("img",img);
		return "showImg";
	}
}
