package com.csi.oops.infy;
class Bank{
 int rateofInterest(){
		return 0;
	}
}

class ICICIBank extends Bank{
	 int rateofInterest(){
		return 10;
	}
}
class BOIBank extends Bank{
	int rateofInterest(){
		return 12;
	}
}
class HDFCBank extends Bank{
	int rateofInterest(){
		return 13;
	}
}
class UBIBank extends Bank{
	int rateofInterest(){
		return 11;
	}
}
public class OverrideConcept33 {
	public static void main(String[] args) {
		UBIBank sbi= new UBIBank();
		System.out.println("\n UBI Bank:"+ sbi.rateofInterest());
		HDFCBank hdfc = new HDFCBank();
		System.out.println("\n HDFC Bank:"+ hdfc.rateofInterest() );
		BOIBank boi= new BOIBank();
		System.out.println("\n BOI Bank:"+ boi.rateofInterest());
		ICICIBank icici= new ICICIBank();
		System.out.println("\n ICICI Bank:"+ icici.rateofInterest());
		}

	}


