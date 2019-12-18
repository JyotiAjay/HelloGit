package com.csi.threads;

class Thread2 extends Thread{
	public void run(){
		int i;
		for(i=0;i<5;i++){
			System.out.println("Child Thread");
		}
	}
}
public class ThreadConcept {
	public static void main(String[] args) {
		Thread2 t= new Thread2();
		t.start();
	}

	
}
