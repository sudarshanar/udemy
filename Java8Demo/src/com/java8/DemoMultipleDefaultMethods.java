package com.java8;

public class DemoMultipleDefaultMethods {
	public static void main(String[] args) {
		FirstInterface first = new FirstInterface() {
		};
		first.show();
		SecondInterface second = new SecondInterface() {
		};
		second.show();
		TestMultipleDefaultInterface testStub = new TestMultipleDefaultInterface();
		testStub.show();
	}
}

interface FirstInterface {
	default void show() {
		System.out.println("FirstInterface");
	}
}

interface SecondInterface {
	default void show() {
		System.out.println("SecondInterface");
	}
}

class TestMultipleDefaultInterface implements FirstInterface, SecondInterface {

	@Override
	public void show() {
		System.out.println("TestMultipleDefaultInterface");
	}

}