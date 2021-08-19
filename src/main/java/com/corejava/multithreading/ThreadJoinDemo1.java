package com.corejava.multithreading;

public class ThreadJoinDemo1 {
public static void main(String[] args) throws InterruptedException {
	MyThread1.mainThread=Thread.currentThread();
	
	MyThread1 t = new MyThread1();	
	t.start();
	for(int i=0;i<10;i++) 
	{
		System.out.println("main Thread");
		Thread.sleep(1000);
	}
}
}
