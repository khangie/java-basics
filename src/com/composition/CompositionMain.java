package com.composition;

public class CompositionMain {

	/**
	 * Demonstrates composition with using a "has a" relationship
	 *
	 */
	
	public static void main(String[] args) {
		
		Case theCase = new Case("2208", "Dell", "240", new Dimensions(20, 20, 5));
		Monitor monitor = new Monitor("27in", "Acer", 27, new Resolution(2540, 1440));
		Motherboard motherboard = new Motherboard("TEST", "Intel", 4, 6, "v2");
		
		Computer computer = new Computer(theCase, monitor, motherboard);
		computer.getMonitor().drawPixelAt(1500, 1200, "red");
		computer.getMotherboard().loadProgram("Windwos");
		computer.getTheCase().pressPowerButton();
		
	}
	
}
