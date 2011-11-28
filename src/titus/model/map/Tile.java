package titus.model.map;

public class Tile {

	private final int x;
	private final int y;
	private final int z;

	private Tile(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	private Tile(int x, int y) {
		this(x, y, 0);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public Tile transform(int x, int y) {
		return new Tile(this.x + x, this.y + y, this.z);
	}

	public static Tile locate(int x, int y, int z) {
		return new Tile(x, y, z);
	}

	public static Tile locate(int x, int y) {
		return new Tile(x, y);
	}

}