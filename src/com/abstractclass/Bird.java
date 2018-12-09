package com.abstractclass;

public abstract class Bird extends Animal implements CanFly {

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

	@Override
	public void fly() {
		System.out.println(this.getName() + " is flying");
	}
	
}
