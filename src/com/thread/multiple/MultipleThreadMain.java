package com.thread.multiple;

public class MultipleThreadMain {

	public static void main(String[] args) {
		
		Countdown countdown = new Countdown();
		
		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread 1");
		
		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread 2");
		
		CountdownThread t3 = new CountdownThread(countdown);
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}

class Countdown {
	
	// This variable will be shared by all threads which result in thread interference (race condition) if not synchronized
	private int i;
	
	// Adding "public synchronized void" will allow only one thread to access the function at a time
	public void doCountdown() {
		
		String value = Thread.currentThread().getName();
		
		// Synchronize this block of code based on this object
		synchronized(this) {
			for (i = 10; i > 0; i--) {
				System.out.println("Thread " + value + ": " + i);
			}	
		}
		
	}
}

class CountdownThread extends Thread {
	
	private Countdown countdown;
	
	public CountdownThread(Countdown countdown) {
		this.countdown = countdown;
	}
	
	public void run() {
		countdown.doCountdown();
	}
	
}