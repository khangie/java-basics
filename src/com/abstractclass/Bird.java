package com.abstractclass;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + " is pecking");
	}

	@Override
	public void breath() {
		System.out.println(this.getName() + " is breathing fast");
	}

	public abstract void fly();
	
}
