package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Dan3Controller {
	@RequestMapping(value = "/dan3", method = RequestMethod.GET)
	public String dan3print() {
		
		return "dan3";
	}
}
