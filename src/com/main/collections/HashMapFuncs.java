package com.main.collections;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program having below methods.
 *		--> To create a hashmap.
 *		--> To search for a key in the created map and then returns its value.
 *
 *@author: Manjula Acharya
 */

public class HashMapFuncs {
	 
	
	public static Map<String, Double> createHashMap()
	{
		Map<String, Double> m = new HashMap<String, Double>();
		
		m.put("apple", 3.29);
		m.put("orange", 2.99);
		m.put("banana", 1.29);
		m.put("grape", 5.39);
		m.put("apricot", 10.29);
		m.put("tangerine", 1.59);
		
		return m;
	}
	
	
	public static Double getKeyValue(HashMap<String, Double> m, String hkey)
	{
		return(m.get(hkey));
	}
	

	public static void main(String[] args) {
		
		HashMap<String, Double> m = (HashMap<String, Double>)createHashMap();
		
		String key = "grape";
		System.out.println("Value for key " + key + " is " + getKeyValue(m, key));

	}

}
