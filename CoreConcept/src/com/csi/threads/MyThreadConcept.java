package com.csi.threads;

class  ExMyThread extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("PUNE");
	}
}
}
public class MyThreadConcept {
	public static void main(String[] args) {
		ExMyThread t1 = new ExMyThread();
		t1.start();
	//	t1.start();  java.lang.IllegalThreadStateException
	}

}
