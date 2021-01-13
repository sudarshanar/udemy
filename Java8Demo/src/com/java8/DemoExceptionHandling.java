package com.java8;

import java.util.function.BiConsumer;

public class DemoExceptionHandling {

	public static void main(String[] args) {
		int sumNumbers[] = { 10, 20, 30, 42 };
		int key = 0;
		processArray(sumNumbers, key, wrapperLambda((a, b) -> System.out.println(a / b)));
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> con) {
		// TODO Auto-generated method stub
		return (a, b) -> {
			try {
				con.accept(a, b);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		};
	}

	public static void processArray(int[] sumNumbers, int key, BiConsumer<Integer, Integer> con) {
		for (int i : sumNumbers) {
			con.accept(i, key);
		}
	}
}
