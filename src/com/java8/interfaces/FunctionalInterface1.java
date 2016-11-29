package com.java8.interfaces;

@FunctionalInterface
public interface FunctionalInterface1 {

	void parameter(String value);

	static void sayMyName(String name) {
		System.out.println("Your name:" + name);
	}

	static void calculateSqrt(int value) {
		System.out.println("Sqrt is :" + Math.sqrt(value));
	}

}
