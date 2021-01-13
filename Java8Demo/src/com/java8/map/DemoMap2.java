package com.java8.map;

import java.util.Arrays;
import java.util.List;

public class DemoMap2 {

	public static void main(String[] args) {
		List<String> vehicle = Arrays.asList("Car", "Bus", "Bycycle", "Aeroplane", "Boat", "Rocket", "Truck",
				"MotorCycle", "Tripper", "Tractor");
		
		vehicle
		.stream()
		.filter(v->(v.length()<=6))
		.map(v->v.substring(0, 2))
		  .forEach(System.out::println);

	}

}
