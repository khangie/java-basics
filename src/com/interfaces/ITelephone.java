package com.interfaces;

public interface ITelephone {

	// Note that we do not need access modifiers because it will be defined in the class
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
	
}
