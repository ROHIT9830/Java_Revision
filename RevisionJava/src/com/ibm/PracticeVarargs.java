package com.ibm;

public class PracticeVarargs {
	int sum=0;
	public int show(int ...i) {			//Varargs or Variable Arguments
		for(int n:i) {
			sum=sum+n;
		}
		return sum;
	}
	public void disp() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		PracticeVarargs pv=new PracticeVarargs();
		pv.show(56,90,55,43,11);
		pv.disp();
	}

}
