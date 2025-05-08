package com.acorn.day2.food;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodController2 {
	
	@Autowired
	FoodService service;
	
	//메소드 단위로 매핑
	@RequestMapping(value="/food2", method = RequestMethod.GET)
	public String getFood(Model model) {
		
		String[] foods  = service.getFood2();
		String food = service.getFood();
		Map<String,Integer> map = service.getMap();
		
		model.addAttribute("food",food);
		model.addAttribute("foods",foods);
		model.addAttribute("map",map);
		return "foodView";
	}
}
