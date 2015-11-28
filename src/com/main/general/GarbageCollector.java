package com.main.general;

/*
* Write a program implementing explicit garbage collection.
* 
* @author: Manjula Acharya
*/


public class GarbageCollector {

	public static void main(String[] args) {
		
		GCollection garb = new GCollection("Collect me");
		
		//Set the reference to null, so that finalize() can get called on this
		garb = null;
		
		//Run garbage collector explicitly, which in turn calls finalize() on the object
		System.gc();

	}

}

 
class GCollection {
	private String collect;
 
	public GCollection(String collect) {
		this.collect = collect;
		System.out.println(collect);
	}
 
	@Override
	public void finalize() {
		System.out.println(this.collect + " - Done!");
	}
}
