package titus.model;

import titus.model.map.Tile;

public abstract class Entity {

	private Tile tile;

	public Tile getTile() {
		return tile;
	}

	protected void setTile(Tile tile) {
		this.tile = tile;
	}

}