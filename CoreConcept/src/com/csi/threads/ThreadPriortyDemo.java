package com.csi.threads;

class MyThreadPriorty extends Thread {
	public void run() {
		int i;
		for (i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadPriortyDemo {
	public static void main(String[] args) {
		MyThreadPriorty t = new MyThreadPriorty();
		t.setPriority(10); 
		t.start();
		int i;
		for (i = 0; i <= 10	; i++) {
			System.out.println("Main Thread");
		}

	}

}
