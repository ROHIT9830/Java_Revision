package com.ibm;

public class PracticeConstructor {
	
	public int A;
	public String B;
	
	public PracticeConstructor() {						//default constructor
		
		this.A=78;
		System.out.println("In default Constructor"+" "+A+" "+B);
	}
	
	public PracticeConstructor(int n) {						//parameterized constructor
		this.A=n;											//'this' refers to class level variable 
															//whereas n refers to instance variable
		
		System.out.println("In parameterized Constructor"+" "+A+" "+B);
	}

	public PracticeConstructor(double n, String m) {			//parameterized constructor
		this.A=(int)n;
		this.B=m;
		System.out.println("In parameterized Constructor"+" "+A+" "+B);
}

	public static void main(String[] args) {
		
		PracticeConstructor pc=new PracticeConstructor();						//calling default constructor
		PracticeConstructor pc1=new PracticeConstructor(56);					//calling parameterized constructor
		PracticeConstructor pc2=new PracticeConstructor(78.9000,"Hello World");		//calling parameterized constructor
		//pc1.A=8;
		System.out.println(pc.A);
		System.out.println(pc1.A);
		System.out.println(pc2.A+" "+pc2.B);

	}

}
