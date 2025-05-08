package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController2 {
	
	@Autowired
	BookService service;
	
	@RequestMapping(value="/book2", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook2();
		model.addAttribute("book", book);
		
		return "bookView";
	}
}
