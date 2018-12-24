package com.ibm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeCollection {

	public static void main(String[] args) {
		
		Collection cl=new ArrayList<>();
		cl.add(34);
		cl.add("Rohit");
		cl.add("+98=@3");
		//System.out.println(cl);
		Iterator it=cl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			}
		System.out.println("-------------------------------------");

		List li=new ArrayList<>();
		li.add(3);
		li.add(9);
		li.add(12);
		li.add(1, 6);			//1 is index no and 6 is the value, so o/p should be 3,6,9,12
		Collections.sort(li);
		Collections.reverse(li);
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Using for loop, fetching list:
		System.out.println("--------------");
		for(int k=0;k<li.size();k++) {
			System.out.println(li.get(k));
		}
	}

}
