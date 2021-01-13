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
		
		String newBook = null;
		optionalString = Optional.ofNullable(newBook);
		if(optionalString.isPresent())
			System.out.println(optionalString.orElse("empty String").toLowerCase());
	}

}
