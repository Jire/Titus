package titus.logic.mask;

import titus.logic.Entity;

public class Splat {

	private final Entity owner;
	private final int damage;

	private Splat(Entity owner, int damage) {
		this.owner = owner;
		this.damage = damage;
	}

	public Entity getOwner() {
		return owner;
	}

	public int getDamage() {
		return damage;
	}

	public static Splat create(Entity owner, int damage) {
		return new Splat(owner, damage);
	}

}