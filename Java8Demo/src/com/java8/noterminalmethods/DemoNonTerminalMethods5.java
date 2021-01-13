package com.java8.noterminalmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoNonTerminalMethods5 {

	public static void main(String[] args) {
		List<String> animals = Arrays.asList("cat","lion","tiger","cow");
		List<String> birds = Arrays.asList("peackok","crow","parrot","sparrow","bat","pigeon");
		Stream.concat(animals.stream(), birds.stream()).forEach(System.out::println);
	}

}
