package com.acorn.day2.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodController3 {
	
	@Autowired
	FoodService service;
	
	//메소드 단위로 매핑
	@RequestMapping(value="/food3", method = RequestMethod.GET)
	public String getFood(Model model) {
		
		String food  = service.getFood();
		
		
		model.addAttribute("food",food);
		return "foodView";
	}
}
