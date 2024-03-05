package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestCaseDemo {
	
    
	@Test
	@DisplayName("Print")
	/*void test() {
		fail("Not yet implemented");
	}*/
	void methodOne()
	{
		System.out.println("Test case is passed");
	}
	
	@Test
	void methodTwo()
	{
		System.out.println("Test case2 is passed");
	}
}


