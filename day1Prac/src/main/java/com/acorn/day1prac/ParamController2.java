package com.acorn.day1prac;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParamController2 {
	@RequestMapping(value="/checkboxForm", method = RequestMethod.GET)
	public String view() {
		return "checkboxView";
	}

	@RequestMapping(value = "/paramT1", method = RequestMethod.POST)
	public String checkbox(String[] fruit) {
		
		for(String s : fruit) {
			System.out.println(s);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/paramT2", method = RequestMethod.POST)
	public String checkbox2(HttpServletRequest request) {
		
		String[] list = request.getParameterValues("fruit");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		return "redirect:/";
	}
}
