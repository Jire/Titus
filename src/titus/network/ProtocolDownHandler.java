package titus.network;

public abstract class ProtocolDownHandler extends ProtocolWayHandler {

	@Override
	public TrafficWay getWay() {
		return TrafficWay.UP;
	}

}