package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

//롬복으로 만든거임(생성자 주입)
@RequiredArgsConstructor
@Controller
public class BookController6{
	
	//여기다가 final을 써줘야한다
	final BookService2 service;


	@RequestMapping(value="/book5", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook();
		model.addAttribute("book", book);
		
		return "bookView";
	}
}

// 주입
// 생성자 주입 (가장 많이 쓰임)
// 세터 주입
// 필드 주입
