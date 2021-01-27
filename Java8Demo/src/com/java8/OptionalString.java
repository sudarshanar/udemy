package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalString {
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.empty();

		optionalString = Optional.of("Test");
		optionalString = Optional.ofNullable("Test");

		if (optionalString.isPresent())
			System.out.println(optionalString.get().toUpperCase());

		Optional<String> optionalString1 = Optional.ofNullable(null);
		System.out.println(optionalString1.orElse("empty String").toLowerCase());

		
		//Optional Calss with Person class
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Lenord", "Halfstader", 35));
		personList.add(new Person("Rajesh", "Koothrupalli", 28));
		personList.add(new Person("Sheldon", "Cooper", 25));
		Optional<List<Person>> optionalPerson = Optional.ofNullable(personList);
		optionalPerson.orElse(new ArrayList<>()).stream().forEach(
				person -> System.out.println(person.getfName() + "-" + person.getlName() + ":" + person.getAge()));
	}
}
