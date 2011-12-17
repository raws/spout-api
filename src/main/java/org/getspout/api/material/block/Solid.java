package org.getspout.api.material.block;

import org.getspout.api.material.SolidBlock;
import org.getspout.api.material.block.GenericBlockMaterial;

public class Solid extends GenericBlockMaterial implements SolidBlock{
	private final boolean falling;
	public Solid(String name, int id, int data, boolean falling) {
		super(name, id, data);
		this.falling = falling;
	}
	
	public Solid(String name, int id, boolean falling) {
		super(name, id, 0);
		this.falling = falling;
	}
	
	public Solid(String name, int id) {
		super(name, id, 0);
		this.falling = false;
	}
	
	public Solid(String name, int id, int data) {
		super(name, id, data);
		this.falling = false;
	}

	public boolean isFallingBlock() {
		return falling;
	}

}