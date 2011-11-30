package titus.model.map.pf;

import java.util.LinkedList;
import java.util.Queue;

import titus.model.map.Tile;

public class Path {

	private final Queue<Tile> steps = new LinkedList<Tile>();

	public boolean addStep(Tile step) {
		return steps.add(step);
	}

	public boolean removeStep(Tile step) {
		return steps.remove(step);
	}

	public Tile peek() {
		return steps.peek();
	}

	public Tile poll() {
		return steps.poll();
	}

	public boolean hasRemainingSteps() {
		return !steps.isEmpty();
	}

	public void clearSteps() {
		steps.clear();
	}

}