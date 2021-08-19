package com.corejava.multithreading.producerconsumerproblem;

import java.util.LinkedList;

public class PC2 {

	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 1;

	// Prints a string and wait for consume()
	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			// synchronized block ensures only one thread running at a time
			synchronized (this) {
				while (list.size() == capacity)
					wait();
				System.out.println("Produced : " + value);
				list.add(value++);
				notify();
				Thread.sleep(1000);

			}
		}
	}

	// sleeps for sometime and waits for a key press. After key
	// is pressed.it notifies produce()
	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {

				while(list.size() == 0)
					wait();
				int value = list.removeFirst();
				System.out.println("Consumed : "+value);
				notify();
				Thread.sleep(1000);
				
			}
		}

	}
}
