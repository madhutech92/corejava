package com.corejava.multithreading;

public class MyThread1 extends Thread{

	
	static Thread mainThread;
	@Override
	public void run() {
	
	try {
		mainThread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
	}
	}

}
