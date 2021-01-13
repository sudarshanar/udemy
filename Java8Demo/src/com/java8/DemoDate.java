package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DemoDate {

	public static void main(String[] args) {
		// Current Date
LocalDate l= LocalDate.now();
System.out.println(l);

//perticular date
LocalDate l1= LocalDate.of(1989, Month.MAY, 22);
System.out.println(l1);

//current time
LocalTime t = LocalTime.now();
System.out.println(t);

//getting zoneids
for(String s :ZoneId.getAvailableZoneIds()) {
	
	//current time//adding zoneids
	LocalTime t1 = LocalTime.now(ZoneId.of(s));
	System.out.println(s+" : "+t1);
}
	
	}

}
