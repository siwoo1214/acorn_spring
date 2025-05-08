package com.acorn.day2.book;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	String title;
	String author;
	int price;	
}
