package com.csi.threads;
class ImpRunn implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			int i;
			for(i=1; i<=5; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Implement");
		}
		
	}

}

public class ImplementThreadConcept {
	public static void main(String[] args) {
		ImpRunn T1= new ImpRunn();
		Thread T= new Thread (T1);
		T.start();
		
	}

	}


