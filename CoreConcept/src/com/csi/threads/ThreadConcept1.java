package com.csi.threads;

class NewThread extends Thread {
	public void run() {// run method is also available in thread method so we are override here
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I AM IN PUNE");
		}
	}
}

public class ThreadConcept1 {
	public static void main(String[] args) {
		NewThread tt = new NewThread();
		tt.start();
		

	}

}
