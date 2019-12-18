package com.csi.switchconcept;

public class SwitchJavatpoint {
	public static void main(String[] args) {
 
	    String levelString="Beginner";  
	    int level=0;  
	
	    switch(levelString){    
	   
	    case "Beginner": 
	    	System.out.println("level=1");  
	    break;    
	    case "Intermediate": 
	    	System.out.println("level=2");  
	    break;
	    case "Expert":
	    	  System.out.println("level=3");  
	    break;    
	    default: level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  
	}
}
		   
		   

