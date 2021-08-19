package com.corejava.multithreading;

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {

		
		MyThread t=new MyThread();
		t.start();
		t.join(); //main Thread waits completion of child Thread t 
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
		
	}
}
