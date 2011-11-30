package titus.model.mask;

public class Chat {

	private final String text;
	private final int color;
	private final int effect;

	private Chat(String text, int color, int effect) {
		this.text = text;
		this.color = color;
		this.effect = effect;
	}

	public String getText() {
		return text;
	}

	public int getColor() {
		return color;
	}

	public int getEffect() {
		return effect;
	}

	@Override
	public String toString() {
		return text;
	}

	public static Chat create(String text, int color, int effect) {
		return new Chat(text, color, effect);
	}

}