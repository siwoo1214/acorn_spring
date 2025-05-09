package com.acorn.prac;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
	private String name;
	private int age;
	private String team;
}
