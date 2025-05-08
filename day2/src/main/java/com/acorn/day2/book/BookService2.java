package com.acorn.day2.book;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class BookService2 {
	
	public String getBook() {
		
		return "책 먹는 여우";
	}
	
	
	public String getBook2() {
		
		String[] books = new String[] {"코스모스", "종의 기원", "사피엔스", "호모데우스"};
		
		Random r = new Random();
		int index = r.nextInt(books.length);
		
		String bookName = books[index];
		return bookName;
	}
}
