package titus.model.mask;

public class Animation {

	private final int id;
	private final int delay;

	private Animation(int id, int delay) {
		this.id = id;
		this.delay = delay;
	}

	private Animation(int id) {
		this(id, 0);
	}

	public int getId() {
		return id;
	}

	public int getDelay() {
		return delay;
	}

	public static Animation create(int id, int delay) {
		return new Animation(id, delay);
	}

	public static Animation create(int id) {
		return new Animation(id);
	}

}