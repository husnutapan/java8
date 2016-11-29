package com.java8.interfaces;

@FunctionalInterface
public interface FunctionalInterface2 {

	void notParameter();

	default void logging(String logValue) {
		System.out.println("Logging value" + logValue);
	}

}
