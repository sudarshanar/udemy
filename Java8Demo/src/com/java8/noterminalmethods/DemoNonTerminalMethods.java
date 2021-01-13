package com.java8.noterminalmethods;

import java.util.Arrays;
import java.util.List;

public class DemoNonTerminalMethods {

	public static void main(String[] args) {
		List<String> vehicle = Arrays.asList("Car", "Bus", "Bycycle", "Aeroplane", "Boat", "Rocket", "Truck",
				"MotorCycle", "Tripper", "Tractor", "Bycycle", "Rocket", "Car");
		// Distinct
		vehicle.stream().distinct().forEach(s -> System.out.println(s));
		// Count
		System.out.println(vehicle.stream().distinct().count());
		// Limit
		vehicle.stream().distinct().limit(5).forEach(s -> System.out.println(s));
	}

}
