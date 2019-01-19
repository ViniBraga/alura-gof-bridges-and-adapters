package Adapter;

import java.util.Calendar;

public class ClockSystem implements GenericClock {

	public Calendar today() {
		return Calendar.getInstance();
	}

}
