package titus.event;

import java.util.HashMap;
import java.util.Map;

public class EventManager {

	private final Map<Event, EventHandler> events = new HashMap<Event, EventHandler>();

	public EventHandler getHandler(Event event) {
		return events.get(event);
	}

	public void dispatch(Event event) {
		EventHandler handler = getHandler(event);

		if (handler != null) {
			handler.handle(event);
		}
	}

}