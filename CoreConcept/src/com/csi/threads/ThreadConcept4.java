package com.csi.threads;



	class ThreadM extends Thread{
		public void run(){
			System.out.println("no-arg run");
		}
		public void run (int i){
			System.out.println("int-age run");// overloaded and a normal method
		}
	}

	public class ThreadConcept4 {
		public static void main(String[] args) {
		ThreadM tt= new ThreadM();
			tt.start();
		}

		

	}


