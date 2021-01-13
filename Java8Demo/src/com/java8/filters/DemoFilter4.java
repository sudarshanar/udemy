package com.java8.filters;

import java.util.Arrays;
import java.util.List;

public class DemoFilter4 {

	public static void main(String[] args) {
		List<Employe> myList = Arrays.asList(new Employe("Sudarshan", "MD", 25), new Employe("Sam", "CEO", 33),
				new Employe("Navdeep", "TL", 22), new Employe("Raj", "SSE", 29), new Employe("Soma", "SE", 66));
		System.out.println("id more than 22");
myList.stream().filter(emp->(emp.getId()>22)).forEach(System.out::println);
System.out.println("Name starts with S");
myList.stream().filter(emp-> emp.getName().startsWith("S")).forEach(System.out::println);
	}

}
