package com.ibm;

class Outer{						//when PracticeInnerClass.java is compiled this will be Outer.class
	
	public void show() {
		System.out.println("Inside Outer class");
	}
	
	class Inner {					//when PracticeInnerClass.java is compiled this will be Outer$Inner.class
	public void display() {
		System.out.println("Inside Inner Class");
	}
	}
	
}

public class PracticeInnerClass {	//when PracticeInnerClass.java is compiled this will be PracticeInnerClass.class

	public static void main(String[] args) {
		
		Outer obj=new Outer();				//Object of outer class
		obj.show();
		
		Outer.Inner obj1=obj.new Inner();	//Object of Inner class
		obj1.display();
	}

}
