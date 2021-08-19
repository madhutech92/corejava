package com.corejava.multithreading.interthreadcomm;

public class ThreadA {
public static void main(String[] args) throws InterruptedException {
	ThreadB b=new ThreadB();
	b.start();
	synchronized (b) {
	System.out.println("main thread calling wait method");
	b.wait();
	System.out.println("main thread got notified");
	System.out.println(b.total);
	}
}
}
