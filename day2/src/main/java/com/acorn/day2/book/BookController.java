package com.acorn.day2.book;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	@Autowired  //필드주입
	BookService service;
	
	@RequestMapping(value="/titles", method = RequestMethod.GET)
	public String showTitles(Model model){
		ArrayList<String> title = service.getTitles();
		model.addAttribute("title",title);
		return "titles";
	}
	
	@RequestMapping(value="/select", method = RequestMethod.GET)
	public String selectOne(String title,Model model){
		model.addAttribute("book",service.getbook(title));
		return "selectedBook";
	}
}
