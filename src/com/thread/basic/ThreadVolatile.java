package com.thread.basic;

import java.util.Scanner;

class Processor extends Thread {
	
	// Setting the volatile property prevents the variable from being cached so that shutdown can activate it
	private volatile boolean running = true;
	
	public void run() {
		
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutdown() {
		running = false;
	}
	
}

public class ThreadVolatile {

	public static void main(String[] args) {
		
		Processor proc1 = new Processor();
		proc1.start();
	
		System.out.println("Press return to stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		
	}

}
