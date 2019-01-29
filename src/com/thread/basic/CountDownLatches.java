package com.thread.basic;

/**
 * Use CountDownLatch to specify an action after x number of threads has completed.
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 implements Runnable {

	private CountDownLatch latch;
	
	public Processor1(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Started.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Thread will decrement the countdown
		latch.countDown();
		
	}
	

	
}

public class CountDownLatches {

	public static void main(String[] args) {
		
		// Lets you count down from the number you specify
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 3; i++) {
			executor.submit(new Processor1(latch));
		}
	
		try {
			// Waits for CountDownLatch to reach zero
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed.");
		
	}

}
