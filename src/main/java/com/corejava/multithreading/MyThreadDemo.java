package com.corejava.multithreading;

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		//t1.setPriority(10);
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}

		/*
		 * MyRunnable myRunnable= new MyRunnable(); Thread t1=new Thread(myRunnable);
		 * t1.start();
		 */

	}

}
