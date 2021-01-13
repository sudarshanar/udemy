package com.java7;

public class NormalInnerClass {
	static int y=55;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		NormalInnerClass.Inner inner = new NormalInnerClass().new Inner();
		inner.main();
	}
	class Inner {
		public void main() {
			System.out.println("Inner");
		}
	}

}
