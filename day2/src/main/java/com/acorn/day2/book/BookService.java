package com.acorn.day2.book;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	ArrayList<Book> list = new ArrayList<Book>();
	
	private void setList() {
		list.add(new Book("어린왕자", "생텍쥐페리", 5600));
		list.add(new Book("데미안", "헤르만 헤세", 7200));
		list.add(new Book("1984", "조지 오웰", 8800));
		list.add(new Book("죄와 벌", "도스토옙스키", 9900));
		list.add(new Book("태백산맥", "조정래", 15000));
	}
	
	public Book getbook(String title) {
		setList();
		for(Book a : list) {
			if(a.getTitle().equals(title)) {
				return a;
			}
		}
		return null;
	}
	
	public ArrayList<String> getTitles(){
		setList();
		ArrayList<String> titles = new ArrayList<String>();
		for(Book a : list) {
			titles.add(a.getTitle());
		}
		return titles;
	}
	
	public static void main(String[] args) {
		BookService b = new BookService();
		System.out.println(b.getbook("데미안"));
	}

	public String getBook2() {
		// TODO Auto-generated method stub
		return null;
	}
}
