package abstractfactorydesignpattern;

public class Factoryzone {
	
	public static Zone createZone(String zoneId) {
		
		Zone zone = null;
		
		if (zoneId == "US/Pacific") {
		
			zone = new Pacificzone ();
		
		}
		
		else if (zoneId == "US/Mountain") {
		
			zone = new Mountainzone();
		
		}
		
		else if (zoneId == "US/Central") {
		
			zone = new Centralzone();
		
		}
		
		else if (zoneId == "US/Eastern") {
		
			zone = new Easternzone();
		
		}
		
		return zone;

	}

}
