package titus.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

	public static EventHandler toEventHandler(Class<?> clazz) throws InstantiationException, IllegalAccessException {
		return (EventHandler) clazz.newInstance();
	}

	private final Map<Event, ArrayList<EventHandler>> events = new HashMap<Event, ArrayList<EventHandler>>();

	public List<EventHandler> getHandlers(Event event) {
		return events.get(event);
	}

	public void dispatch(Event event) {
		List<EventHandler> handlers = getHandlers(event);

		if (handlers != null) {
			for (EventHandler handler : handlers) {
				handler.handle(event);
			}
		}
	}

	public void register(Event event, EventHandler... handlers) {
		if (handlers == null || getHandlers(event) == null) {
			createEventEntry(event);
			return;
		}

		for (EventHandler handler : handlers) {
			getHandlers(event).add(handler);
		}
	}

	public void register(Event event, Class<?>... handlers) {
		if (handlers == null) {
			return;
		}

		try {
			for (Class<?> clazz : handlers) {
				register(event, toEventHandler(clazz));
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void createEventEntry(Event event) {
		events.put(event, new ArrayList<EventHandler>());
	}

}