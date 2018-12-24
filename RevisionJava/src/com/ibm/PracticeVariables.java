package com.ibm;

public class PracticeVariables {
	public int a = 5;
	public float b = 5.6f;
	public double c = 6.7000;
	public char d = 'a';
	public String e = "This is a line";
	public boolean f = true;

	public static void main(String[] args) {
		PracticeVariables pv = new PracticeVariables();
		if (pv.f == false | pv.d != 'b') {
			System.out.println("Value is by default");
		} else {
			System.out.println("Value is inherited");
		}
	}

}
