package com.bilgeadam.boost.java.course01.lesson93.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

import org.junit.jupiter.api.Test;

import com.bilgeadam.boost.java.course01.lesson93.Convertion;

class ConvertionTest {
	
	@Test
	void testTemperture() {
		Convertion testConvertion = new Convertion();
		double temp = 80.0d;
		double result = testConvertion.temperture(temp, "f");
		assertEquals(176, result);
		
		result = testConvertion.temperture(129, "c");
		result *= 1000;
		
		double r = Math.round(result * 10000);
		
		assertEquals(53.8889, result);
		
	}
	
}
