package com.acorn.day3.db.prac;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	String id;
	String pw;
	String name;
	String tel;
}
