package titus.network;

public abstract class ProtocolUpHandler extends ProtocolWayHandler {

	@Override
	public TrafficWay getWay() {
		return TrafficWay.UP;
	}

}