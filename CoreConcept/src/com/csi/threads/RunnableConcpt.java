package com.csi.threads;
class MyRunnable implements Runnable{
	public void run(){
		for( int i=0; i<5; i++){
			System.out.println("child Thread");
			
		}
	}
}

public class RunnableConcpt {

	public static void main(String[] args) {
		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r);
		t.start();
		for (int i =0; i<5; i++);
		System.out.println("Main Thread");
	}

}
