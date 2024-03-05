package com.edubridge.mockitodemo;

//program to demonstrate on @Wmock annotation.
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class MockAnnotationDemo {
	
	
	@Mock
	List<String>m1;
	
	
	//If you are not adding this block of method,you will get a null pointer exception.
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setData()
	{
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void accept() {
		when(m1.get(0)).thenReturn("Akshay");
		Assertions.assertEquals(m1.get(0), "Akshay");
	}

}
