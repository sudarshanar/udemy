package com.java8;

public class DemoStringCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCaseConverter con = str -> {
			if (Character.isUpperCase(str.charAt(0)))
				return str.toLowerCase();
			return str.toUpperCase();
		};
		System.out.println(con.converter("SUDARSHAN"));
		System.out.println(con.converter("soma sundar"));
	}

}
@FunctionalInterface
interface StringCaseConverter {
	public abstract String converter(String str);
}