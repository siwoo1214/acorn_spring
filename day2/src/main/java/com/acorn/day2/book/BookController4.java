package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController4 {
	
	BookService2 service;
	
	//생성자 주입
	@Autowired
	public BookController4(BookService2 service) {
		super();
		this.service = service;
	}



	@RequestMapping(value="/book4", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook();
		model.addAttribute("book", book);
		
		return "bookView";
	}
}