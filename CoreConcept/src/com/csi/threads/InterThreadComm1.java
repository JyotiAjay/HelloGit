package com.csi.threads;
class Customer{
	int amount =10000;
	synchronized public void withdraw(int amount){
		System.out.println("\n Going to withdraw money");
		if(this.amount<=amount){
			System.out.println("\n Insufficient balance, Please wait for Deposit");
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("\n Amount withdral successfully");
		
	}
	synchronized public void deposit(int ammount){
		System.out.println("\n Going to deposit money");
		this.amount+=amount;
		System.out.println("\n Amount deposit succesfully");
			notify();
		}
	}

public class InterThreadComm1 {

	public static void main(String[] args) {
		Customer cc= new Customer();
		new Thread(){
			public void run(){
				cc.withdraw(15000);
				
			}
		}.start();
		new Thread(){
			public void run(){
				cc.deposit(10000);
			}
		}.start();
		
	}
}
