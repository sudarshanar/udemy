package com.java8;

public class DemoRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("run"));
		t.start();
	}

}
