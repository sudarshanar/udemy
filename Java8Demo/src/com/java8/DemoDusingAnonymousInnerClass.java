package com.java8;

public class DemoDusingAnonymousInnerClass {

	public static void main(String[] args) {
		TestAnonymusInnerclass inner = new TestAnonymusInnerclass() {
			@Override
			public void use2No(int a, int b) {
				System.out.println(a+b);
				}
			};
			inner.use2No(10, 25);
	}
}
interface TestAnonymusInnerclass{
	public void use2No(int a,int b);
}
