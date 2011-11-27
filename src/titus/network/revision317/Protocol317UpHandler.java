package titus.network.revision317;

import titus.event.Event;
import titus.network.ProtocolUpHandler;

public final class Protocol317UpHandler extends ProtocolUpHandler {

	@Override
	public void registerValidEvents() {
		enable(Event.UNKNOWN);
	}

}