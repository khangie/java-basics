package com.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		ITelephone phone = new DeskPhone(111222);
		phone.powerOn();
		phone.callPhone(111222);
		phone.answer();
	}
	
}
