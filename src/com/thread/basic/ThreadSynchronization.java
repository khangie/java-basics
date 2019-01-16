package com.thread.basic;

public class ThreadSynchronization {

	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {

		ThreadSynchronization app = new ThreadSynchronization();
		app.doWork();

	}

	public void doWork() {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			
			// Join causes the system to wait until the thread has completed
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: " + count);
		
	}
	
}
