package com.acorn.day1prac.실습;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieHomeController {
	@RequestMapping(value="/day1prac")
	public String redirectHome() {
		return "redirect:/movie/home1";
	}
}
