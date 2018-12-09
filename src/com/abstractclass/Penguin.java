package com.abstractclass;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Penguin does not fly very well.");
	}

}
