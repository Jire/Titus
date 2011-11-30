package titus.network;

import titus.Application;
import titus.event.Event;

public abstract class ProtocolWayHandler {

	protected void register(Event event, Class<?>... handlers) {
		Application.getApplication().getEventManager().register(event, handlers);
	}

	protected abstract TrafficWay getWay();

	protected abstract void registerValidEvents();

}