package com.java8.again;

import java.util.Arrays;
import java.util.List;

import com.java8.Person;

public class Java8Filter1 {

	public static void main(String[] args) {
		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
		myList.stream().filter(s-> s.getAge()>23).forEach(System.out::println);

	}

}
