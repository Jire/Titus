package titus.model.mask;

public class Graphic {

	private final int id;
	private final int height;
	private final int delay;

	private Graphic(int id, int height, int delay) {
		this.id = id;
		this.height = height;
		this.delay = delay;
	}

	private Graphic(int id, int height) {
		this(id, height, 0);
	}

	private Graphic(int id) {
		this(id, 0);
	}

	public int getId() {
		return id;
	}

	public int getHeight() {
		return height;
	}

	public int getDelay() {
		return delay;
	}

	public static Graphic create(int id, int height, int delay) {
		return new Graphic(id, height, delay);
	}

	public static Graphic create(int id, int height) {
		return new Graphic(id, height);
	}

	public static Graphic create(int id) {
		return new Graphic(id);
	}

}