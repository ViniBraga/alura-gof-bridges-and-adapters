import java.io.IOException;

import Adapter.ClockSystem;
import Adapter.GenericClock;
import bridge.GoogleMaps;
import bridge.Maps;

public class App {

	public static void main(String[] args) throws IOException {

		// Bridges hide the complexity of other systems
		// I can get other system through a new way (bridges)
		Maps map = new GoogleMaps();
		map.getMap("Fifth Avenue");
		
		// Adapters hide the complexity of dealing with legacy code
		// It adapts an old implementation to a new one. 
		// It is used to migrate and refactor systems
		GenericClock clock = new ClockSystem();
		clock.today();
		
	}

}
