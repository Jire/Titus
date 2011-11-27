package titus.network.revision317;

import titus.network.Protocol;
import titus.network.ProtocolDownHandler;
import titus.network.ProtocolUpHandler;

public class Protocol317 implements Protocol {

	@Override
	public Type getType() {
		return Type.REVISION_317;
	}

	@Override
	public ProtocolDownHandler getDownHandler() {
		return new Protocol317DownHandler();
	}

	@Override
	public ProtocolUpHandler getUpHandler() {
		return new Protocol317UpHandler();
	}

}