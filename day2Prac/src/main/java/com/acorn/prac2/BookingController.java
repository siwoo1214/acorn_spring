package com.acorn.prac2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookingController {
	
	@Autowired
	BookingService service;
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showBooking(Model model) {
		ArrayList<Booking> b = service.showAll();
		model.addAttribute("list",b);
		return "showBooking";
	}
	
	@RequestMapping(value="/showOne", method=RequestMethod.GET)
	public String showOne(String name, Model model) {
		Booking b = service.showOne(name);
		model.addAttribute("booking",b);
		return "showOne";
	}
	
	@RequestMapping(value="/addBooking", method=RequestMethod.GET)
	public String addOne() {
		return "addBooking";
	}

	@RequestMapping(value="/addBook", method=RequestMethod.POST)
	public String addOne(  Booking booking) {
		
		System.out.println("dkdfkfkf");
		service.addOne(booking);
		return "redirect:/show";
	}
}
