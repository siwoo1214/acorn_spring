package com.acorn.day2.di2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dan3 {


    @RequestMapping(value = "/dan", method = RequestMethod.GET)
    public String showDan() {
        return "dan3";
    }
		
    
//    @RequestMapping(value = "/selectDan", method = RequestMethod.GET)
//    public String selectDan(
//    		@RequestParam(required = false, defaultValue= "2") int num,
//    		Model model) {
//    	
//    	model.addAttribute("num", num);
//    	
//    	
//    	
//    	return "dan";
//    }
    
    
}
