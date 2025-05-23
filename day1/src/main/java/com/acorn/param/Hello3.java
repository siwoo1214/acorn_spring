package com.acorn.param;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello3 {

	
	//매서드단위로 매핑
	@RequestMapping("/books")
	void method1( Model model) {
		// 모델 => 서비스 
		
		ArrayList<Book> list  = new ArrayList<Book>();
		
		Book book1 = new Book();
		book1.setCode("B01");
		book1.setName("부의법칙");
		book1.setImg("book1.jpg");
		list.add(book1);
		
		
		Book book2 = new Book();
		book2.setCode("B02");
		book2.setName("고구려");
		book2.setImg("book2.jpg");
		list.add(book2);
		
		Book book3 = new Book();
		book3.setCode("B03");
		book3.setName("스프링");
		book3.setImg("book3.jpg");
		list.add(book3);
		
		
		model.addAttribute("booklist", list);		
		//view응답 (매핑의 이름을  view로 사용함 )
	}
	
}
