package com.corejava.multithreading.synchronization;

public class MyThread extends Thread {

	Display display;
	String name;
	
	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}
