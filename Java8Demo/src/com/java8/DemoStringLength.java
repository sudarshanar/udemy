package com.java8;

public class DemoStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStringLength.disp(str->str.length());
	}
	public static void disp(StringLengthDemo obj) {
		obj.show();
		System.out.println(obj.getLength("Sudarshan"));
	}

}
interface StringLengthDemo{
	public abstract int getLength(String str);
	default void show(){
		System.out.println("Show");
	}
}