package com.corejava.multithreading.interthreadcomm;

public class ThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {

		synchronized (this) {

			for (int i = 1; i < 100; i++) {
				total = total + 1;
			}
			System.out.println("child giving notification");
			this.notify();
		}
	}

}
