package com.java8.map;

import java.util.Arrays;
import java.util.List;

import com.java8.filters.Employe;

public class DemoMap3 {

	public static void main(String[] args) {
		List<Employe> myList = Arrays.asList(new Employe("Sudarshan", "MD", 25), new Employe("Sam", "CEO", 33),
				new Employe("Navdeep", "TL", 22), new Employe("Raj", "SSE", 29), new Employe("Soma", "SE", 66));

		myList.stream().filter(emp -> emp.getRole().length() == 2).map(emp -> emp.getName().concat(" The Great"))
				.forEach(emp->System.out.println(emp));
	}

}
