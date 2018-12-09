package com.abstractclass;

public class AbstractClassMain {

	public static void main(String[] args) {
	
		Animal dog = new Dog("Poodle");
		dog.breath();
		dog.eat();
		
		System.out.print("\n");
		
		Bird parrot = new Parrot("Parrot");
		parrot.breath();
		parrot.eat();
		parrot.fly();
		
		System.out.print("\n");
		
		Bird penguin = new Penguin("Emperor");
		penguin.fly();
		
	}
}
