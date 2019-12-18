package com.csi.exception;

public class ExceptionHandling {
	public static void main(String args[]){  
		int a[]= new int[6];
	for(int i=0;i<6;i++)
		a[i]=1;
		 /* try{  
		  
		    try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		    }catch(ArithmeticException e)
		    {System.out.println(e);}  
		   
		    try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		     
		    System.out.println("other statement");  
		  }catch(Exception e){System.out.println("handeled");}  
		  
		  System.out.println("normal flow..");  */
	for(int i=0;i<6;i++)
		System.out.println(a[i]);
		 }  
		}  


