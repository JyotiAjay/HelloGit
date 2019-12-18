package com.csi.threads;
class MyThreadB extends Thread{
	public void run(){
		int i;
		for(i=1; i<=5; i++){
			System.out.println("JEERY THREAD");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinThreadConcept {

	

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		MyThreadB t= new MyThreadB();
		t.start();
		t.join(1000);
		//Show with and without time period 
		int i;
		for(i=1; i<=5; i++){
			System.out.println("Tom THREAD");
	}

	}
}

