package abstractfactorydesignpattern;

import java.util.*;

public class Calendartrail{
	
	public static void main(String[] args) {
	
		Factoryzone factoryzone = new Factoryzone();

		pacificcalendar calendar = new pacificcalendar(factoryzone);
		
		List<String> appts = Arrays.asList("appt 1", "appt 2");
		
		new pacificcalendar(factoryzone).createCalendar(appts);
		
//		new Calendars().print();
	}




	
}