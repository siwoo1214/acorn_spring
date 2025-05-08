package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dan3Controller {
	@GetMapping("/dan3")
	public String dan3print() {
		
		return "dan3";
	}
}
