package com.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
* Write a program having different methods to perform below 
* operations.
*	--> To create an ArrayList and add elements to it.
*	--> To search for an element in the list.
*	--> To print the elements of the list using iterator.
*	--> To print the elements in the reverse order using ListIterator.
*/

public class MyArrayList {
	
	public static ArrayList<AnimalFarm> createArrayList()
	{
		AnimalFarm f1 = new AnimalFarm("Cow", 120);
		AnimalFarm f2 = new AnimalFarm("Sheep", 75);
		AnimalFarm f3 = new AnimalFarm("Goat", 35);
		AnimalFarm f4 = new AnimalFarm("Chicken", 250);
		AnimalFarm f5 = new AnimalFarm("Pig", 50);
		AnimalFarm f6 = new AnimalFarm("Duck", 25);
		
		ArrayList<AnimalFarm> myFarm = new ArrayList<AnimalFarm>();
		
		myFarm.add(f1);
		myFarm.add(f2);
		myFarm.add(f3);
		myFarm.add(f4);
		myFarm.add(f5);
		myFarm.add(f6);
		
		return myFarm;
	}
	
	public static void searchArrayList(ArrayList<AnimalFarm> myList, String searchStr)
	{
		
		for(AnimalFarm farm : myList)
		{
			if((farm.animal).equals(searchStr))
			{
				System.out.println("Farm animal found:" + farm.animal + " Count is: " + farm.count);
				break;
			}
			
		}
		
	}
	
	public static void printArrayList(ArrayList<AnimalFarm> myList)
	{
		Iterator<AnimalFarm> it = myList.iterator();
		while(it.hasNext())
		{
			AnimalFarm farm = it.next();
			System.out.println("Farm animal:" + farm.animal + " Count is: " + farm.count);
		}
	}
	
	public static void printArrayListInReverese(ArrayList<AnimalFarm> myList)
	{
		ListIterator<AnimalFarm> lit =  myList.listIterator();
		//Traverse to the end of the list
		while(lit.hasNext())
			lit.next();
		
		//Now print out the list in Reverse 
		System.out.println("List in reverse:");
		while(lit.hasPrevious())
		{
			AnimalFarm farm = lit.previous();
			System.out.println("Farm animal:" + farm.animal + " Count is: " + farm.count);
		}
	}
	

	public static void main(String[] args){
		
		//Create a new ArrayList and populate with data
		ArrayList<AnimalFarm> myFarm = createArrayList();
		
		//Search for an element in the ArrayList
		searchArrayList(myFarm, "Sheep");
		
		//Print the ArrayList using Iterator
		printArrayList(myFarm);
		
		//Print the ArrayList in Reverse using ListIterator
		printArrayListInReverese(myFarm);

	}

}
