package titus.model.mask;

public class Sound {

	private final int id;
	private final byte volume;
	private final int delay;

	private Sound(int id, byte volume, int delay) {
		this.id = id;
		this.volume = volume;
		this.delay = delay;
	}

	private Sound(int id, int volume, int delay) {
		this(id, (byte) volume, delay);
	}

	private Sound(int id, int volume) {
		this(id, volume, 0);
	}

	private Sound(int id) {
		this(id, 0);
	}

	public int getId() {
		return id;
	}

	public byte getVolume() {
		return volume;
	}

	public int getDelay() {
		return delay;
	}

	public static Sound create(int id, int volume, int delay) {
		return new Sound(id, volume, delay);
	}

	public static Sound create(int id, int volume) {
		return new Sound(id, volume);
	}

	public static Sound create(int id) {
		return new Sound(id);
	}

}