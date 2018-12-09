package com.interfaces;

public class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk phone does not have a power button");
	}
	
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on desk phone");
		
	}
	
	@Override
	public void answer() {
		System.out.println("Answering the desk phone");
		isRinging = false;
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ringing");
		} else {
			isRinging = false;
		}
		return false;
	}
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
