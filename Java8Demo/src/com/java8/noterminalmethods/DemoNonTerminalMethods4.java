package com.java8.noterminalmethods;

import java.util.HashSet;
import java.util.Set;

public class DemoNonTerminalMethods4 {

	public static void main(String[] args) {
		Set<String> fruites = new HashSet<>();
		fruites.add("one Mango");
		fruites.add("one Apple");
		fruites.add("more Grapes");
		fruites.add("two JackFruite");
		fruites.add(" two Pomogranet");
		Set<String> emptyFruites = new HashSet<>();
		//anymatch
		System.out.println( fruites.stream().anyMatch(str->str.startsWith("one")));
		//allmatch
		System.out.println( fruites.stream().allMatch(str->str.startsWith("one")));
		//noneMatch
		System.out.println( fruites.stream().noneMatch(str->str.startsWith("ram")));
		
		//findAny
		System.out.println( fruites.stream().findAny().get());
		//findAny with emptyList
				System.out.println(emptyFruites.stream().findAny().get());
	}

}
