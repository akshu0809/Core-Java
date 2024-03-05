package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void testTwo() {
		int x=10,y=10;
		Assumptions.assumingThat(x==y, ()->{
			System.out.println("Assuming That....");
		});
		System.out.println("This method  will not skip");
	}

}
