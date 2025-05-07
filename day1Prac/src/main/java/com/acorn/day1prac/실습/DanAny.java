package com.acorn.day1prac.실습;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DanAny {
	@RequestMapping(value="/whatdan", method = RequestMethod.GET)
	public String danyouwant() {
		return "whatdan";
	}
	
	@RequestMapping(value = "/danshow", method = RequestMethod.GET)
	public String danshow(int num, Model model) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(num*i);
		}
		
		model.addAttribute("num",num);
		model.addAttribute("list",list);
		return "danshow";
	}
}
