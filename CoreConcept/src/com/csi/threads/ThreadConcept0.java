package com.csi.threads;
class MyThread0 extends Thread{
	public void run(){
		System.out.println("Run method is executed by:"+Thread.currentThread().getName());//child thread
	}
}
public class ThreadConcept0 {
public static void main(String[] args) {
	MyThread0 t= new MyThread0();
	t.start();
	System.out.println("Main method is executed by:"+Thread.currentThread().getName());
}
	
}
 
//Main method is executed by:main // main thread
//Run method is executed by:Thread-0 child thread