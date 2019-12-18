package com.csi.threads;
class Display
{
	synchronized public void wish(String name)
	{
		int i;
		for(i=0; i<=5; i++)
		{
			System.out.println("Good Morning");
		try {
				Thread.sleep(1000);
			}
catch (InterruptedException e) {}
																						
				
					System.out.println(name);
				}
			}
		}
	
	class NThread extends Thread{
		Display d;
		String name;	
		NThread(Display d, String name){
			this.d=d;
			this.name=name;	
		}
		public void run(){
		
	   d.wish(name);
	}
	
}

public class SynchronizedConcept
{
public static void main(String[] args) 
{
	Display d= new Display();
	
	NThread t1= new NThread(d,"Ajay");
	NThread t2= new NThread(d,"Vijay");
	t1.start();
	t2.start();
}
	
}



