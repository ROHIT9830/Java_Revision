package com.ibm;

//Types of Interfaces:
//1.Normal Interface : Interfaces having more than one method
//2.Single Abstract Method (SAM) Interface/Functional Interface(java 1.8 onwards): Interfaces having only one method
//3.Marker Interface : Interfaces having no method

interface IAbc{
	void show();
}

class Implementor implements IAbc{

	public void show() {
		System.out.println("Interface implemented");
	}
	
	
}

public class PracticeInterfaces {

	public static void main(String[] args) {
		
		IAbc obj=new Implementor();
		obj.show();
	}

}
