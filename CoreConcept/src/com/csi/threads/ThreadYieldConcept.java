package com.csi.threads;

class MyThreadA extends Thread {
	public void run() {
		int i;
		for (i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class ThreadYieldConcept {

	public static void main(String[] args) {
		MyThreadA t = new MyThreadA();
		t.start();
		for(int i=0; i<=10; i++){
		System.out.println("Main Thread");

	}
// Child class always calls yield method bcuz of that main Thread will get a chance then after child come
}
	
}
