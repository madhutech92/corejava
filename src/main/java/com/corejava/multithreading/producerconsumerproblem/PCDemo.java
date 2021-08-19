package com.corejava.multithreading.producerconsumerproblem;

public class PCDemo {
	public static void main(String[] args) throws InterruptedException {
		final PC2 pc = new PC2();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Producer");
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Consumer1");
		
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Consumer2");
		
		//start both the threads
		t1.start();
		t2.start();
		t3.start();
		//main Thread will wait for t1 and t2
		  t1.join(); t2.join();

	}
}
