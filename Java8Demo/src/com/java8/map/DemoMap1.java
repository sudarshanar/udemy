package com.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMap1 {

	public static void main(String[] args) {
		List<String> vehicle = Arrays.asList("Car", "Bus", "Bycycle", "Aeroplane", "Boat", "Rocket", "Truck",
				"MotorCycle", "Tripper", "Tractor");
		/*
		 * //converting to Upper case Before Java 8 for(String v : vehicle) {
		 * vehicleListInUpperCase.add(v.toUpperCase()); }
		 */
		
//		vehicle.stream().map(str-> str.toUpperCase()).forEach(str->System.out.println(str));
		
		List<String> vehicleListInUpperCase = vehicle.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleListInUpperCase);
	}

}
