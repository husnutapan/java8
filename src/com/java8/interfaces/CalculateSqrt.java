package com.java8.interfaces;

public interface CalculateSqrt {

	double calculate(int value);
	
	default double sqrt(int value) {
		return Math.sqrt(value);
	}

}
