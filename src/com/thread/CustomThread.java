package com.thread;

public class CustomThread extends Thread {

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " - start");
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(currentThread().getName() + " - another thread woke me up");
		}
		
		System.out.println(currentThread().getName() + " - 3 seconds have passed");
		
	}

}
