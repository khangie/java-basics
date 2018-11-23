package com.thread.basic;

public class CustomThread extends Thread {

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " - start");
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			// This exception occurs when the thread is interrupted
			System.out.println(currentThread().getName() + " - another thread woke me up");
			return;
		}
		
		System.out.println(currentThread().getName() + " - 5 seconds have passed");
		
	}

}
