package com.acorn.prac2;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

//@Service
public class BookingService {
	public BookingService() {
		setList();}
	
	
	ArrayList<Booking> list = new ArrayList<Booking>();
	
	private void setList() {
		list.add(new Booking("홍길동", 3, 150000));
		list.add(new Booking("김영희", 2, 100000));
		list.add(new Booking("박철수", 5, 250000));
		list.add(new Booking("이민호", 1, 50000));
		list.add(new Booking("최지우", 4, 200000));
	}
	
	public ArrayList<Booking> showAll() {
		
		return list;
	}
	
	public Booking showOne(String name) {
		for(Booking a : list) {
			if(a.getName().equals(name)) {
				return a;
			}
		}
		return null;
	}
	
	public void addOne(Booking booking) {
		list.add(booking);
	}
}
