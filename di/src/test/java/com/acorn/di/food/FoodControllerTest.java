package com.acorn.di.food;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;



@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" } )
class FoodControllerTest {

	
	@Autowired
	Food food;
	
	@Test
	void test() {
		  String menu  = food.getFood();
		   System.out.println( menu);
		  
		  assertTrue(true);
		
		 // log.info( menu);
	}

}
