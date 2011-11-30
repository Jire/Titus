package titus.model.map;

import java.util.LinkedList;
import java.util.Queue;

import titus.model.Entity;

public class MovementQueue {

	private final Queue<Tile> steps = new LinkedList<Tile>();

	public boolean addStep(Tile step) {
		return steps.add(step);
	}

	public void process(Entity entity) {

	}

}