package com.csi.threads;

class Student {
	int marks = 500;

	synchronized public void IIT(int marks) {
		System.out.println("\n Going  to IIT");
		if (this.marks <= marks) {
			System.out.println("\n Study Hard for getting IIT");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.marks -= marks;
		System.out.println("\n Going for Exam");
	}

	synchronized public void efforts(int marks) {
		System.out.println("\n Study day and night");
		this.marks += marks;
		System.out.println("\n All Syllabus finish");
		notify();
	}

}

public class InterThreadCommunication2 {

	public static void main(String[] args) {

		Student ss = new Student();
		new Thread() {
			public void run() {
				ss.IIT(700);
			}
		}.start();
		new Thread() {
			public void run() {
				ss.efforts(200);
			}
		}.start();

	}
}