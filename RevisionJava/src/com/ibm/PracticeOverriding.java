package com.ibm;

class Abc{
	int speed=90;
	public void show() {
		System.out.println("In class Abc");
	}
}

class Bcd extends Abc{
	int speed=150;
		public void show() {				//this method is overriding the show() method in Abc class
			//super.show();
		System.out.println("In class Bcd");
	}
}

public class PracticeOverriding {

	public static void main(String[] args) {
		Abc obj1=new Bcd();
		//Bcd obj=new Bcd();
		obj1.show();
		//System.out.println(obj.speed);
		System.out.println(obj1.speed);		//method is overriden but not data members
	}

}
