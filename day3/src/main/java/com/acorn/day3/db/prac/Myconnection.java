package com.acorn.day3.db.prac;

public class Myconnection implements MyAutoCloseable{
	@Override
	public void close() {
		System.out.println("Connection 객체 close하기");
	}
}
