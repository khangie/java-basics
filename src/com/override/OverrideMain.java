package com.override;

/**
 * Demonstrates the following which does not override
 * - Hiding the superclass static method
 * - Creating a private method in the child class with the same name as the parent class.
 *
 */

public class OverrideMain {

	public static void main(String[] args) {
		
		Base obj= new Derived();
		obj.print();
		Derived.display();

	}
	
}

class Base {
	public static void display() {
		System.out.println("Static or class method from Base");
	}
	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	public static void display() {
		System.out.println("Static or class method from Derived");
	}	
	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}
