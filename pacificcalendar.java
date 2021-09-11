package abstractfactorydesignpattern;

import java.util.*;

public class pacificcalendar extends Calendars{
	
	public pacificcalendar(Factoryzone factoryzone) {
		
		// make a calendar for the pacific zone
		
		// ...
		factoryzone.createZone("US/Pacific");
	
	}
	
	public void createCalendar(List<String> appointments) {
	
		// make calendar from appointments
		
		System.out.println("Creating the Calendars");
	}

}
