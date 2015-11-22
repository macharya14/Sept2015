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

public class ArrayListOperations {
	
	public static ArrayList<MenuItem> createArrayList()
	{
		MenuItem f1 = new MenuItem("Ravioli", 8.99);
		MenuItem f2 = new MenuItem("Spaghetti", 6.99);
		MenuItem f3 = new MenuItem("Lasagna", 15.99);
		MenuItem f4 = new MenuItem("Pita-Humus", 3.99);
		MenuItem f5 = new MenuItem("Falafel", 5.99);
		MenuItem f6 = new MenuItem("Burger", 7.99);
		
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		
		menu.add(f1);
		menu.add(f2);
		menu.add(f3);
		menu.add(f4);
		menu.add(f5);
		menu.add(f6);
		
		return menu;
	}
	
	public static void searchArrayList(ArrayList<MenuItem> list, String searchStr)
	{
		
		for(MenuItem mitem : list)
		{
			if((mitem.item).equals(searchStr))
			{
				System.out.println("Menu Item found:" + mitem.item + " Price is: " + mitem.price);
				break;
			}
			
		}
		
	}
	
	public static void printArrayList(ArrayList<MenuItem> myList)
	{
		Iterator<MenuItem> it = myList.iterator();
		while(it.hasNext())
		{
			MenuItem mitem = it.next();
			System.out.println("Menu item:" + mitem.item + " Price is: " + mitem.price);
		}
	}
	
	public static void printArrayListInReverese(ArrayList<MenuItem> myList)
	{
		ListIterator<MenuItem> lit =  myList.listIterator();
		//Traverse to the end of the list
		while(lit.hasNext())
			lit.next();
		
		//Now print out the list in Reverse 
		System.out.println("List in reverse:");
		while(lit.hasPrevious())
		{
			MenuItem mitem = lit.previous();
			System.out.println("Menu item:" + mitem.item + " Price is: " + mitem.price);
		}
	}
	

	public static void main(String[] args){
		
		//Create a new ArrayList and populate with data
		ArrayList<MenuItem> menu = createArrayList();
		
		//Search for an element in the ArrayList
		searchArrayList(menu, "Burger");
		
		//Print the ArrayList using Iterator
		printArrayList(menu);
		
		//Print the ArrayList in Reverse using ListIterator
		printArrayListInReverese(menu);

	}

}
