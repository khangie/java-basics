package com.abstractclass;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	// Since all animals breath, these methods should be in an abstract class instead of an interface
	public abstract void eat();
	public abstract void breath();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
