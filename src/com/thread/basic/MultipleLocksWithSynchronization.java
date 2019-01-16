package com.thread.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocksWithSynchronization {

	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	
	public void stageOne() {
		
		// Allows a thread to run stage one without locking stage two
		synchronized(lock1) {
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	
	public void stageTwo() {
		
		// Allows a thread to run stage two without locking stage one
		synchronized(lock2) {
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}
	
	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public static void main(String[] args) {
		
		MultipleLocksWithSynchronization worker = new MultipleLocksWithSynchronization();
		
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				worker.process();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				worker.process();
			}
		});
		

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		System.out.println("List1: " + worker.list1.size() + " List2: " + worker.list2.size());
	}
	
}
