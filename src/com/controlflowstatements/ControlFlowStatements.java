package com.controlflowstatements;

public class ControlFlowStatements {

	public static void main(String[] args) {

		// Switch
		int switchValue = 1;
		
		switch (switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			default:
				System.out.println("No value");
				break;
		}
		
		// Do (guaranteed to execute at least once)
		int count = 1;
		do {
			System.out.println("Count value is " + count);
			count++;
		} while (count !=6);

	}

}
