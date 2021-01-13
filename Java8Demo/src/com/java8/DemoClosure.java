package com.java8;

public class DemoClosure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
	}

	private static void doProcess(int a, Process p) {
		p.process(a);
	}

}

interface Process {
	void process(int i);
}