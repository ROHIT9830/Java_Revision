package com.ibm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PracticeGenerics {

	public static void main(String[] args) {
		
		List<Integer> value=new ArrayList<>();		//List is by default mutable
		
		value.add(588658);
		value.add(7795);
		value.add(96867);
		value.add(6570);
		Comparator<Integer> c=new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if(i%10>j%10) {
					return 1;
				}else
				return -1;
			}
			
		};
		
		Collections.sort(value, c);
		//Collections.reverse(value);
		
		Iterator itr=value.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
