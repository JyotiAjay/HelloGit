package com.csi.oops.infy;
class Hostel{
	void get(int stdEnrollment, String stdName){
		System.out.println("\n Student Enorllment:"+ stdEnrollment+"\n Student Name:"+stdName);
	}
	void get(int stdRoomNo,double stdRoomName){
		System.out.println("\n Student RoomNo:"+stdRoomNo+"\n Student Room Name"+stdRoomName);
	}
}
public class OverloadConcept5 {
	public static void main(String[] args) {
		Hostel HH= new Hostel();
		HH.get(125, "ROSSY");
		HH.get(12, "RoSE");
	}

}
