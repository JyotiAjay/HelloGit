package com.csi.threads;
class AbThread extends Thread{
	public void start(){
		//super.start();
		System.out.println("Start Method");
// run as normal method call and the child class don't start.it consider as only one thread
	}
	public void run(){
		System.out.println("Run Method");
	}
}

public class ThreadConcept5 {

	public static void main(String[] args) {
		AbThread t= new AbThread();
		t.start();
		System.out.println("Main Methode");
	}

}
