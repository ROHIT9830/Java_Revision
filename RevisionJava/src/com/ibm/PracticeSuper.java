package com.ibm;

class A{

	public A() {
		//super();
		System.out.println("In A");
		}
	public A(int A) {
		super();
		System.out.println("In A int");
		}
}
class B extends A{

	public B() {
		super(7);
		System.out.println("In B");
	}

	public B(int A) {
		super(A);
		System.out.println("In B int");
	}
	
}

public class PracticeSuper {

	public static void main(String[] args) {
		B obj=new B(7);
		B obj1=new B();
	}

}
