package com.java8;

public class DemoCalculator {
	public static void main(String[] args) {
		DemoInterfaceFor2Arg demo = (a, b) -> a + b;
		System.out.println(demo.use2No(10, 20));
		DemoInterfaceFor2Arg demoSub = (a, b) -> a - b;
		System.out.println(demoSub.use2No(25, 10));
		DemoInterfaceFor2Arg demoMult = (a, b) -> a * b;
		DemoInterfaceFor2Arg demoDev = (a, b) -> {if(b<=0)return 0 ; return a / b;};
		System.out.println(demoDev.use2No(25, 10));
		System.out.println(demoMult.use2No(25, 10));
	}
}
//Commiting from intellij
interface DemoInterfaceFor2Arg {
	public abstract int use2No(int a, int b);
}
