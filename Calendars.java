/**
 * 
 */
package abstractfactorydesignpattern;

import java.util.*;

public abstract class Calendars {
	
	Zone zone;
	
	public void print() {
	
		System.out.println("--- " + zone.getDisplayName() + " Calendar ---");
		
		// print all appointments in correct time zone
		
		System.out.println("Offset from GMT: " + zone.getOffset());
	
	}
	
	public abstract void createCalendar(List<String> appointments);	

}

