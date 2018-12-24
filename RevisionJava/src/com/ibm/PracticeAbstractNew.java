package com.ibm;

interface IWriter{
	void write();
	
}

class Pen implements IWriter{
	public void write() {
		System.out.println("I am a pen");
	}
}

class Pencil implements IWriter{
	public void write() {
		System.out.println("I am a pencil");
	}
}

class Kit{
	public void doSomething(IWriter w) {
		w.write();
	}
}

public class PracticeAbstractNew {
	public static void main(String[] args) {
		
		Kit k=new Kit();
		//Writer w=new Writer();
		IWriter p=new Pen();
		IWriter pc=new Pencil();
		k.doSomething(p);
		k.doSomething(pc);
		
	}

}
