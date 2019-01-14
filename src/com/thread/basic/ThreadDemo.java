package com.thread.basic;

/*
 * METHOD 1: Implement a thread by extending the Thread class
 */

class Runner extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*
 * METHOD 2: implement a thread by implementing the Runnable interface
 */

class Runner2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		
		Runner runner1 = new Runner();
		runner1.start();
	
		Runner runner2 = new Runner();
		runner2.start();
		
		Thread t1 = new Thread(new Runner2());
		t1.start();
		
		Thread t2 = new Thread(new Runner2());
		t2.start();
		
		// Anonymous function
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Hello " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t3.start();
		
	}
	
}
