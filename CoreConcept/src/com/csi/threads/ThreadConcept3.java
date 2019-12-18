package com.csi.threads;

class MyThread extends Thread {

}

public class ThreadConcept3 {
	public static void main(String[] args) {
		MyThread tt = new MyThread();
		tt.start();
	}

}
// it will not giving any output just because of we r not using any method.