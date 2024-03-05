package com.edubridge.mockitodemo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockitoWithJunitDemo {
	//Dependency Injection in the form of objects.
	private TestCaseClass tcc;
	
	//For checking the condition in the main Testing class using mock method.
	@BeforeEach
	void setDemo()
	{
		tcc=mock(TestCaseClass.class);
		when(tcc.add(1,1)).thenReturn(2);
		when(tcc.sub(2,2)).thenReturn(2);
	}
	
	
	@Test
	void testAddition()
	{
		Assertions.assertEquals(2,tcc.add(1, 1));
		verify(tcc).add(1,1);
		
	}
	
	@Test
	void testSubtraction()
	{
		Assertions.assertEquals(2,tcc.sub(2, 2));
		verify(tcc).sub(2,2);
	}

	
}
