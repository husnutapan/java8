package com.java8.test;

import com.java8.interfaces.CalculateSqrt;

public class DefaultInterfaceTest {

	public static void main(String[] args) {
		CalculateSqrt calculateSqrt = new CalculateSqrt() {
			@Override
			public double calculate(int value) {
				return sqrt(value * 100);
			}
		};

		System.out.println(calculateSqrt.calculate(10));
		System.out.println(calculateSqrt.sqrt(16));

	}

}
