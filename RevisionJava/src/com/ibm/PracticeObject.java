package com.ibm;

public class PracticeObject {
public int num1;
public int num2;
public int result;

public void perform() {
	result=num1*num2;
}
public static void main(String[] args) {
	PracticeObject po=new PracticeObject();		//object of class PracticeObject
	po.num1=20;
	po.num2=31;
	po.perform();
	System.out.println(po.result);
}
}
