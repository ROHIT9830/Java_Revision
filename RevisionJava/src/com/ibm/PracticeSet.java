package com.ibm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PracticeSet {

	public static void main(String[] args) {
		
		Set<Integer> st=new HashSet<>();
		st.add(8);
		st.add(5);
		st.add(7);
		st.add(9);
		
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
