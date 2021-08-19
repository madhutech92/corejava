package com.corejava.multithreading.synchronization;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Display display1 = new Display();
		//Display display2 = new Display();
		MyThread myThread1 = new MyThread(display1, "dhoni");
		MyThread myThread2 = new MyThread(display1, "Yuvraj");
		myThread1.start();
		myThread2.start();

	}
}
