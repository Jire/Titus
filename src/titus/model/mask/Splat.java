package titus.model.mask;

import titus.model.Entity;

public class Splat {

	public static enum SplatType {

		DEFAULT,
		POISON,
		DISEASE;

		// The elemental ordinal is used as the client value.

	}

	private final Entity owner;
	private final int damage;
	private final SplatType type;

	private Splat(Entity owner, int damage, SplatType type) {
		this.owner = owner;
		this.damage = damage;
		this.type = type;
	}

	private Splat(Entity owner, int damage) {
		this(owner, damage, SplatType.DEFAULT);
	}

	public Entity getOwner() {
		return owner;
	}

	public int getDamage() {
		return damage;
	}

	public SplatType getType() {
		return type;
	}

	public static Splat create(Entity owner, int damage, SplatType type) {
		return new Splat(owner, damage, type);
	}

	public static Splat create(Entity owner, int damage) {
		return new Splat(owner, damage);
	}

}