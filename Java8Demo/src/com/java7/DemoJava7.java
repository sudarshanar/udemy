package com.java7;

public class DemoJava7 {

	public static void main(String[] args) {
		DemoJava7 demoObj = new DemoJava7();
		GreetingStub greetingStub = new GreetingStub();
		demoObj.greet(greetingStub);

	}

	public void greet(Greeting greeting) {
		greeting.perform();
	}
}
