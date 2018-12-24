package com.ibm;

class Calc{
	public int add(int a, int b) {
		return a+b;
	}
}
class CalcAdv extends Calc{
	public int sub(int a, int b) {
		return a-b;
	}
}
class CalcVeryAdv extends CalcAdv{
	public int multi(int a, int b) {
		return a*b;
	}
}

public class PracticeInheritance {

	public static void main(String[] args) {
		
		CalcVeryAdv cva=new CalcVeryAdv();
		int result=cva.add(10, 20);
		int result1=cva.sub(20, 10);
		int result2=cva.multi(10, 20);
		System.out.println("Add : "+result);
		System.out.println("Sub : "+result1);
		System.out.println("Multiply : "+result2);
	}

}
