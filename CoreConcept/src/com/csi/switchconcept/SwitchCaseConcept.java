package com.csi.switchconcept;
import java.util.Scanner; 
  
// An Enum class 
enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 
  
// Driver class that contains an object of "day" and 
// main(). 
public class SwitchCaseConcept 
{ 
    Day day; 
  
    // Constructor 
    public SwitchCaseConcept(Day day) 
    { 
        this.day = day; 
    } 
  
    // Prints a line about Day using switch 
    public void dayIsLike() 
    { 
    	System.out.println(this.day);
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Mondays are bad."); 
            break; 
        case FRIDAY: 
            System.out.println("Fridays are better."); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.println("Weekends are best."); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        String str = "MONDAY"; 
        SwitchCaseConcept t1 = new SwitchCaseConcept(Day.valueOf(str)); 
        t1.dayIsLike(); 
    } 
} 