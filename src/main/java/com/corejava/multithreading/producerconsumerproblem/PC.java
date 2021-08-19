package com.corejava.multithreading.producerconsumerproblem;

import java.util.Scanner;

public class PC {

	//Prints a string and wait for consume()
	public void produce() throws InterruptedException {
		//synchronized block ensures only one thread running at a time
		synchronized (this) {
			System.out.println("Producer Thread running");
			//releases the lock on shared resource
			wait();
			// and waits till some other method invokes notify()
			System.out.println("Resumed");
		}
	}
	
	//sleeps for sometime and waits for a key press. After key
	//is pressed.it notifies produce()
	public void consume() throws InterruptedException {
		//this makes the producer to get chance
		Thread.sleep(1000);
		Scanner s=new Scanner(System.in);
		//synchronized block ensures only one thread running at a time
		synchronized (this) {
			System.out.println("waiting for return key");
			s.nextLine();
			System.out.println("Return key is pressed");
			//notifies the Producer Thread that it can wake up
			notify();
			//Sleep
			Thread.sleep(1000);
		}
	}
}
