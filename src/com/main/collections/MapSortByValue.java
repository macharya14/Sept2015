package com.main.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/*
 * Write a program to sort a map by value.
 * 
 * @author: Manjula Acharya
 */


public class MapSortByValue implements Comparator<Map.Entry<String, Double>>
{
	
	public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2)
	{     
		return (o1.getValue()).compareTo(o2.getValue());
	}
	
	
	public static Map<String, Double> sortByComparator(Map<String, Double> unsortMap) 
	{
		// Convert Map to List
		List<Map.Entry<String, Double>> list = 
			new LinkedList<Map.Entry<String, Double>>(unsortMap.entrySet());

		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new MapSortByValue());
	
		// Convert sorted map back to a Map
		Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
		for (Iterator<Map.Entry<String, Double>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Double> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	

	public static void printMap(Map<String, Double> map) 
	{
		for (Map.Entry<String, Double> entry : map.entrySet())
		{
			System.out.println("[Key] : " + entry.getKey()  + "    [Value] : " + entry.getValue());
                                     
		}
		
	}
		 
	public static void main(String a[])
	{
	    	Map<String, Double> inputMap = new HashMap<String, Double>();
			inputMap.put("Mango", 10.99);
			inputMap.put("Orange", 2.69);
			inputMap.put("Banana", 1.29);
			inputMap.put("Pineapple", 5.29);
			inputMap.put("Apricot", 12.89);
			inputMap.put("Tangerine", 7.99);
			inputMap.put("Apple", 12.99);
			inputMap.put("Grapes", 6.59);

			System.out.println("Unsorted Map......");
			printMap(inputMap);

			System.out.println("\nSorted Map......");
			Map<String, Double> sortedMap = sortByComparator(inputMap);
			printMap(sortedMap);
	 }
		
}

