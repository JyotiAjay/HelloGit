package com.csi.oops.infy;

class GymMember {
	private int memberId;
	private String memberName;
	private double memberHeight;
	private int memberWeight;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public double getMemberHeight() {
		return memberHeight;
	}

	public void setMemberHeight(float memberHeight) {
		this.memberHeight = memberHeight;
	}

	public int getMemberWeight() {
		return memberWeight;
	}

	public void setMemberWeight(int memberWeight) {
		this.memberWeight = memberWeight;
	}
}

public class EncapsulationConcept2 {
	public static void main(String[] args) {
		GymMember MM = new GymMember();
		MM.setMemberId(100);
		MM.setMemberName("MARIA");
		MM.setMemberHeight(5);
		MM.setMemberWeight(60);
		System.out.println("\n Member Id:" + MM.getMemberId() + "\n Member Name:" + MM.getMemberName()
				+ "\n Member Height:" + MM.getMemberHeight() + "\n Member Weight:" + MM.getMemberWeight());

	}
}
