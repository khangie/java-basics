package com.thread;

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
 *
 */

public class ThreadMain {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread");
	
		// Custom thread
		Thread customThread = new CustomThread();
		customThread.start();
	
		// Anonymous class
		new Thread() {
			public void run() {
				System.out.println("Anonymous class thread");
			}
		}.start();
		
	}
	
}
