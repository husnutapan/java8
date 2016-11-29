package com.java8.test;

import com.java8.interfaces.FunctionalInterface1;
import com.java8.interfaces.FunctionalInterface2;

public class FunctionalInterfaceTest implements FunctionalInterface1, FunctionalInterface2 {

	@Override
	public void parameter(String value) {
		System.out.println("Parameter is :" + value);
	}

	@Override
	public void notParameter() {
		System.out.println("Not Parameter function is working...");
	}

	@Override
	public void logging(String logValue) {
		System.out.println("Coming value :" + logValue);
	}

	public static void main(String args[]) {
		// static methods
		FunctionalInterface1.sayMyName("Husnu TAPAN");
		FunctionalInterface1.calculateSqrt(16);

		FunctionalInterfaceTest functionalInterface = new FunctionalInterfaceTest();
		functionalInterface.logging("Logging Parameter...");

		functionalInterface.notParameter();

	}

}
