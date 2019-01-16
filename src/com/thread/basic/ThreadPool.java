package com.thread.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ProcessorNew implements Runnable {

	private int id;
	
	public ProcessorNew(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed: " + id);
		
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		
		// Create a thread pool of 2
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			executor.submit(new ProcessorNew(i));
		}
		
		// Stop accepting new jobs
		executor.shutdown();
		
		System.out.println("All tasks submitted.");
		
		try {
			// Wait up to 1 day for termination of thread pool
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All tasks completed.");
		
	}

}
