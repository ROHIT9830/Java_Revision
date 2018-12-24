package com.ibm;

abstract class Human{					//Abstract Class
	
	public abstract void head();		//Declaration of abstract method inside abstract class
	public abstract void legs();
	public void nose() {
		System.out.println("Nose");
	}
	
}

class Children extends Human{			//Chidren is extending Abstract class Human and implenting its Methods
										//Concrete class : Class extending ABSTRACT class
	@Override
	public void head() {
		System.out.println("Head");
		
	}

	@Override
	public void legs() {
		System.out.println("legs");
		
	}
	
}

public class PracticeAbstract {	

	public static void main(String[] args) {
		
		Children ch=new Children();
		ch.head();
		ch.legs();
		ch.nose();
	}

}
