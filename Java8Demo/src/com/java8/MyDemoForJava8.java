package com.java8;

public class MyDemoForJava8 {
	public static void main(String[] args) {
		Runnable r = ()->{System.out.println("inside Run");};
		r.run();
		Test myTesting = () -> "Sudarshan";
		System.out.println(myTesting.testing());
	}
}
interface Test{
	public String testing();
}
