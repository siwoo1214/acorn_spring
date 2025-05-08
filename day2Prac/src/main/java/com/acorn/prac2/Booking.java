package com.acorn.prac2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Booking {
	String name;
	int days;
	int price;
}
