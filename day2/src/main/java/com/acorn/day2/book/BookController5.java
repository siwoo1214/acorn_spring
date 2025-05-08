package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Setter;

@Controller
public class BookController5 {
	
	@Setter(onMethod_ = @Autowired) //setter를 작성한것과 동일한 코드
	BookService2 service;
	
	//이거와 똑같은 코드
//	@Autowired
//	public void setService(BookService2 service) {
//		this.service = service;
//	}


	@RequestMapping(value="/book5", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook();
		model.addAttribute("book", book);
		
		return "bookView";
	}
}