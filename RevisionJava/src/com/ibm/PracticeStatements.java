package com.ibm;

import java.util.Scanner;

public class PracticeStatements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("First Value : ");
		int a = scn.nextInt();
		System.out.print("Second Value : ");
		int b = scn.nextInt();
		scn.close();
		// boolean value;
		// if else loop
		if (a < 5 && b > 8) {
			System.out.println("Low Score");
		} else {
			System.out.println("High Score");
		}
		// PracticeStatements ps=new PracticeStatements();
		// Switch case practice
		switch (a) {
		case (50):
			System.out.println("Switch Case Output : Good");
			break;
		case (80):
			System.out.println("Switch Case Output : Excellent");
			break;
		default:
			System.out.println("Switch Case Output : none");
		}
		// Ternary operator:
		int v = (a > b) ? a : b;
		System.out.println(v);
	}

}
