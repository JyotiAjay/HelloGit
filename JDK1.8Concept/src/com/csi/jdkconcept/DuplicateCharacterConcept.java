package com.csi.jdkconcept;

public class DuplicateCharacterConcept {
	public static void main(String[] args) {
		int i, j, cnt = 0;
		String cName = "INDIA";
		char CompanyName[] = cName.toCharArray();
		for (i = 0; i < cName.length(); i++) {
			for (j = i + 1; j < cName.length(); j++) {
				if (CompanyName[i] == CompanyName[j]) {
					System.out.println(CompanyName[j]);
					cnt++;
					break;
				}
			}
		}
	}

}
