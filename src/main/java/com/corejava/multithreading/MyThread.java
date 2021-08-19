package com.corejava.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {
		/*
		 * for (int i = 10; i > 0; i--) { // Thread.yield();
		 * 
		 * System.out.println("I am Lazy Thread");
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * System.out.println("I got Interrupted"); }
		 * 
		 * }
		 */

		for (int i = 0; i < 10000; i++) {
			// Thread.yield();

			System.out.println("I am Lazy Thread: " + i);
		}
		System.out.println("I'm Entering into sleeping state");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}

}
