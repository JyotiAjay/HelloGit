package com.csi.oops.infy;
class Automobile{
	void run(){
		System.out.println("Very Crucial");
	}
}
	class Motar extends Automobile{
		void run(){
			System.out.println("It is two wheeler");
		}
	}
		class Car extends Motar{
			void run(){
			System.out.println("It is a four wheeler");
		}
		}
		class Cycle extends Automobile{
			void run(){
				System.out.println("It is a Public Vehical");
			}
		}
public class OverridingConcept {
	public static void main(String[] args) {
		Automobile AA = new Automobile();
		AA.run();
		Motar MM= new Motar();
		MM.run();
		Cycle CC= new Cycle();
		CC.run();

		
		
	}
}


