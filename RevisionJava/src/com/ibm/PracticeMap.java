package com.ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PracticeMap {

	public static void main(String[] args) {
		
		Map<String, String> mp=new HashMap<>();
		mp.put("Name : ", "Rohit");
		mp.put("Eid : ", "0600V");
		mp.put("Company : ", "IBM");
		
		Set<String> key=mp.keySet();
		for(String keys : key) {
			System.out.println(keys+mp.get(keys));
		}
	}

}
