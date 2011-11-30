package titus.model.map.pf;

import titus.model.map.Tile;

public abstract class PathFinder {

	public abstract Path findPath(Tile start, Tile end);

	public Path findPath(int startX, int startY, int endX, int endY) {
		return findPath(Tile.locate(startX, startY), Tile.locate(endX, endY));
	}

	public static PathFinder dijkstraPathFinder() {
		return new DijkstraPathFinder();
	}

}