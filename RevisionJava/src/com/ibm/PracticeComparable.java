package com.ibm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student m) {

		return this.rollno>m.rollno?1:-1;
	}
	
	
}

public class PracticeComparable {

	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();		//List Interface implemented by Class ArrayList
		
		s.add(new Student(101, "Rohit", 90));
		s.add(new Student(104, "Rima", 80));
		s.add(new Student(102, "Nikita", 98));
		s.add(new Student(103, "Rony", 85));
		
		Collections.sort(s);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
