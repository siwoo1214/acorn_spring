package com.acorn.day2.di2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DanController {
	
	@Autowired  //필드 주입
	DanService service;
	
	@RequestMapping(value = "/selectDan", method = RequestMethod.GET)
    public String selectDan(
    		@RequestParam(required = false, defaultValue= "2") int num,
    		Model model) {
    	
		ArrayList<String> dan2List = service.getDanver3(5);
    	model.addAttribute("dan",dan2List);
    	
    	return "dan2";
    }
}
