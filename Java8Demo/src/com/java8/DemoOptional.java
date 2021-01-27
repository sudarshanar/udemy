package com.java8;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> optionalString = Optional.empty();
		
		//traditional way null checking
		String book = "Sam";
		if(book!=null)
			System.out.println(book.toUpperCase());
		
		String newBook = "Test";
//		optionalString = Optional.of(newBook); // will get NPE
		optionalString = Optional.ofNullable(newBook);
		if(optionalString.isPresent())
			System.out.println(optionalString.get().toLowerCase().toUpperCase());
		
		Optional<String> optionalString1 = Optional.ofNullable(null);
		System.out.println(optionalString1.orElse("empty String").toLowerCase());
	}

}
