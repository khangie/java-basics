package com.thread.messages;

import java.util.Random;

/**
 * Demonstrates a producer/consumer
 * 
 * Guidelines
 * 1) We don't want the "read" thread to run while the "write thread is running vice versa
 *
 */

public class MessageMain {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		(new Thread(new Writer(message))).start();
		(new Thread(new Reader(message))).start();
	}
	
}

class Message {
	
	private String message;
	private boolean empty = true;
	
	/**
	 * Used by the consumer to read the message
	 * @return
	 */
	
	public synchronized String read() {
		
		// Loop until there is a message to read
		while (empty) {
			
		}
		
		// By this time, empty = false.  Indicate that we have read the message.
		empty = true;
		
		return message;
	}
	
	/**
	 * Used by the producer to write a message
	 * @param message
	 */
	
	public synchronized void write(String message) {
	
		// Loop until some has read the message
		while(!empty) {
			
		}
		
		// By this time, empty = true.  Indicate that the message is not empty and write to it.
		empty = false;
		
		this.message = message;
		
	}

}

class Writer implements Runnable {
	
	private Message message;
	
	public Writer(Message message) {
		this.message = message;
	}
	
	public void run() {
		String messages[] = {
				"Message 1",
				"Message 2",
				"Message 3",
				"Message 4"
		};
		
		// Create a random delay
		Random random = new Random();
		
		for (int i = 0; i < messages.length; i++) {
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		message.write("Finished");
	}
	
}
	
class Reader implements Runnable {
	
	private Message message;
	
	public Reader(Message message) {
		this.message = message;
	}
	
	public void run() {
		
		Random random = new Random();
	
		for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
	
			System.out.println(latestMessage);
			
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}