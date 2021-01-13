package com.java8;

import java.util.stream.IntStream;

public class DemoIsPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(1));
		System.out.println(isPrime(4));

	}

	private static boolean isPrime(final int num) {
		return (num > 1 && IntStream.range(2, num).noneMatch(dev -> num % dev == 0));
	}

}
