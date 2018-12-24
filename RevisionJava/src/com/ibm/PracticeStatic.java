package com.ibm;

public class PracticeStatic {
	
	int eid;
	int salary;
	static String ceo="Mahesh";
	
	public PracticeStatic(int e, int s) {
		this.eid=e;
		this.salary=s;
		//this.ceo=c;
	}
	
	public void show() {
		System.out.println(eid+" : "+salary+" : "+ceo);
	}

	public static void main(String[] args) {
		
		PracticeStatic rohit = new PracticeStatic(101,4000);
		PracticeStatic debraj = new PracticeStatic(102, 5000);
		rohit.show();
		debraj.show();
	}

}
