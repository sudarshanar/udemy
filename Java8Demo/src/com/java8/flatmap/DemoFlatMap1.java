package com.java8.flatmap;

import java.util.Arrays;
import java.util.List;

public class DemoFlatMap1 {

	public static void main(String[] args) {
		List<Integer> col1 = Arrays.asList(1, 2);
		List<Integer> col2 = Arrays.asList(3, 4);
		List<Integer> col3 = Arrays.asList(5, 6);

		List<List<Integer>> finalCol = Arrays.asList(col1, col2, col3);
		finalCol.stream().flatMap(x -> x.stream().map(s->s+50).filter(i->i>=52)).forEach(System.out::println);
	}

}
