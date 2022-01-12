package com.bilgeadam.boost.java.course01.lesson93;

public class Convertion {
	public static void main(String[] args) {
		Convertion convert = new Convertion();
		
		System.out.printf("45 derece Celcius %2.2f Fahrenheit'a tekabül eder \n", convert.temperture(45.0, "f"));
		System.out.printf("23,5 derece Celcius %2.2f Celcius'a tekabül eder \n", convert.temperture(23.5, "f"));
	}
	
	public double temperture(double temp, String direction) {
		if (direction.equalsIgnoreCase("c")) {
			return (temp - 32) * (5.0 / 9.0);
		} else {
			return (temp * (9.0 / 5.0)) + 32;
		}
	}
	
}
