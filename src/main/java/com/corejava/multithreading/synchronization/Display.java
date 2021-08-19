package com.corejava.multithreading.synchronization;

public class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: "+name);
			System.out.println();
		}
	}
}
