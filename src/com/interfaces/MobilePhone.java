package com.interfaces;

public class MobilePhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone powered on");
	}
	
	@Override
	public void dial(int phoneNumber) {
		if (isOn) {
			System.out.println("Now ringing " + phoneNumber + " on desk phone");
		} else {
			System.out.println("Phone is off");
		}
		
	}
	
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Mobile Phone Ringing");
		} else {
			isRinging = false;
			System.out.println("Mobile phone is not on");
		}
		return false;
	}
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
