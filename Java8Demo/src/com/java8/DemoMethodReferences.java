package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoMethodReferences {

	public static void main(String[] args) {
//		Thread tr= new Thread(()->printString());

		Thread tr = new Thread(DemoMethodReferences::printString);
		tr.start();

		List<Person> myList = Arrays.asList(new Person("Sudarshan", "Ramamurthy", 25), new Person("Sam", "Caran", 33),
				new Person("Navdeep", "Saini", 22), new Person("Raj", "Ramesh", 22), new Person("Soma", "Sundar", 66));
		Collections.sort(myList, (lName1, lName2) -> lName1.getlName().compareTo(lName2.getlName()));
//		myList.stream().forEach((p) -> System.out.println(p));
		System.out.println("LastName with R");
		new DemoMethodReferences().performConditionally(myList, person -> person.getlName().startsWith("R"),
				System.out::println);
	}

	public static void printString() {
		System.out.println("Displaying Something");
	}

	public void performConditionally(List<Person> myList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person demo : myList) {
			if (predicate.test(demo))
				consumer.accept(demo);
		}
	}
}
