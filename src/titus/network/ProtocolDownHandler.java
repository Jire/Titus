package titus.network;

public abstract class ProtocolDownHandler implements ProtocolWayHandler {

	@Override
	public TrafficWay getWay() {
		return TrafficWay.UP;
	}

}