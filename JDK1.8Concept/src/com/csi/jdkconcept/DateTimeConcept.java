package com.csi.jdkconcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeConcept {

	public static void main(String[] args) {
		System.out.println("Current Date:"+LocalDate.now());
		System.out.println("\n Current Date with Time:"+ LocalDateTime.now());
		System.out.println("Before JDk1.8 Current Date:"+new Date());
	}
}
