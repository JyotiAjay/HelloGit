package com.csi.oops.infy;
class vehicle
{
	void run(){
		System.out.println("Vehicle is running");
	}
}
class Bike extends vehicle{
	void run(){
		System.out.println("Bike is running safely");
	}
}
class Bus extends vehicle{
	void run(){
		System.out.println("Bus is Heavy");
	}
}

public class OverridingConcept1 {
public static void main(String[] args) {
	Bike obj= new Bike();
	Bus B= new Bus();
	B.run();
    obj.run();
}
}
