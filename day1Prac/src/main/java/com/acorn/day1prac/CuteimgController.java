package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CuteimgController {
	@RequestMapping(value = "/cuteImg", method = RequestMethod.GET)
	public String getCuteImage(Model model) {
		String data = "messi.jpg";
		model.addAttribute("data",data);
		return "cuteView";
	}
}
