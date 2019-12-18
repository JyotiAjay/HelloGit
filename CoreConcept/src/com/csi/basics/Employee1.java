package com.csi.basics;

public class Employee1 {

	
		private int stdId;
		private String stdName;
		private long stdRolln;
		private String stdAdd;
		private char stdSec;
		public Employee1(int stdId, String stdName, long stdRolln, String stdAdd, char stdSec) {
			super();
			this.stdId = stdId;
			this.stdName = stdName;
			this.stdRolln = stdRolln;
			this.stdAdd = stdAdd;
			this.stdSec = stdSec;
			
		}
		@Override
		public String toString() {
			return "Employee1 [stdId=" + stdId + ", stdName=" + stdName + ", stdRolln=" + stdRolln + ", stdAdd=" + stdAdd
					+ ", stdSec=" + stdSec + "]";
	}

}
