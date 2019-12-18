package com.csi.threads;

class ABC implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello");
		}

	}

}

public class ImplementThread2 {
	public static void main(String[] args) {
		ABC r = new ABC();
		Thread T = new Thread(r);
		T.start();
	}

}
