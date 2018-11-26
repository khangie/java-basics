package com.thread.basic;

/**
 * Summary
 * 1) A PROCESS is a unit of execution that has its own memory space
 * 2) Each instance of the JVM runs as a PROCESS
 * 3) A PROCESS and an APPLICATION are the same thing
 * 4) Each APPLICATION has its own exclusive memory space of HEAP
 * 5) A THREAD is a unit of execution within a PROCESS
 * 6) A PROCESS can have multiple THREADS
 * 7) A THREAD created by a PROCESS shares the PROCESS's memory and files
 * 8) This can potentially create conflicts
 * 9) Each THREAD has a THREAD STACK which is memory that only the THREAD can access
 * 10) A THREAD can be suspended between steps
 * 11) If two or more THREADS are writing to the same resource, a race condition occurs
 * 12) Synchronization 
 *     a) When a method is SYNCHRONIZED, only one METHOD can access it at a time
 *     b) All other threads that want to call the method will suspend until the method is available
 *     c) You cannot synchronize CONSTRUCTORS because only one THREAD can construct an instance
 * 13) Locks 
 *     a) Every object has an intrinsic LOCK
 *     b) A thread will need to acquire an object's LOCK before executing a SYNCHRONIZED statement block
 *     c) PRIMITIVE types DO NOT have an intrinsic lock
 * 
 * 
 * Best Practices
 * 1) Use an anonymous runnable thread to provide the most flexibility
 * 2) Implement the run() method but always call the start() method
 *    a) The JVM will call the run() method 
 */

public class ThreadMain {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread");
	
		// Custom thread
		Thread customThread = new CustomThread();
		customThread.setName("Custom Thread");
		customThread.start();
	
		// Anonymous class
		new Thread() {
			public void run() {
				System.out.println("Anonymous class thread");
			}
		}.start();
		
		// Using a runnable interface
		Thread runnableThread = new Thread(new RunnableThread());
		runnableThread.start();
		
		// Interrupt custom thread
//		customThread.interrupt();
		
		// Anonymous runnable thread
		new Thread(new RunnableThread()) {
			@Override
			public void run() {
				System.out.println("Anonymous runnable thread");
				try {
					// Wait for customThread to complete, then continue execution of this thread.
					System.out.println("Waiting for CustomThread to complete execution (max 2000ms)");
					customThread.join(2000);
					System.out.println("CustomThread terminated or timed out, so I'm running again");
				} catch (InterruptedException e) {
					System.out.println("I couldn't wait after all.  I was interrupted.");
				}
			}
		}.start();
		
	}
	
}
