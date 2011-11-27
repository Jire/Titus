package titus.network;

import java.util.ArrayList;
import java.util.List;

import titus.event.Event;

public abstract class ProtocolWayHandler {

	private final List<Event> events = new ArrayList<Event>();

	protected void enable(Event event) {
		events.add(event);
	}

	public boolean enabled(Event event) {
		return events.contains(event);
	}

	protected abstract TrafficWay getWay();

	protected abstract void registerValidEvents();

}