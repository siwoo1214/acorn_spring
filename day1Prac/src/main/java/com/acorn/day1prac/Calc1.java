package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Calc1 {
	 @RequestMapping(value = "/form", method = RequestMethod.GET)
	    public String showForm() {
	        return "form";
	    }
	
	@RequestMapping(value = "/calcNums", method = RequestMethod.GET)
	public String calc1(int num1, int num2, Model model) {
		
		int sum = num1+num2;
		int subs = num1-num2;
		int mult = num1*num2;
		int divi = num1/num2;
		
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("sum",sum);
		model.addAttribute("subs",subs);
		model.addAttribute("mult",mult);
		model.addAttribute("divi",divi);
		
		return "calc1";
	}
}
