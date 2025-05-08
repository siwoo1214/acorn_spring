package com.acorn.di.food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;

@Controller
public class FoodController {
	
	
	// @Setter(onMethod_ = { @Autowired})
	// 세터를 직접만들고  @Autowired 하는 것과 동일함 
	
	//@Autowired
	FoodService service;
	
	 
	
	@Autowired
	public void setTest(FoodService test) {
		this.service = test;
	}
  
	

	@GetMapping("/foodInfo")
	public String test() {
		
		String result = service.test1();
		System.out.println( result);
		
		return  "result";
	}

}
