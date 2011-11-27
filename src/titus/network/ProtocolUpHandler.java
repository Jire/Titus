package titus.network;

public abstract class ProtocolUpHandler implements ProtocolWayHandler {

	@Override
	public TrafficWay getWay() {
		return TrafficWay.UP;
	}

}