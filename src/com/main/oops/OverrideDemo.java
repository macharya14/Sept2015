package com.main.oops;

/*
 * Write a program to depict the behavior of method overriding.
 * @author: Manjula Acharya
 */

class Bird {

	public void move()
	{
	   System.out.println("Bird can fly");
	}
	
	public void sing()
	{
		System.out.println("Bird can tweet");
	}
}


class Duck extends Bird {
	
	public void move()
	{
		System.out.println("Duck can swim and fly");
	}
	
	public void sing()
	{
	    System.out.println("Duck can quack");
	}
}


public class OverrideDemo {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
		
		Bird d = new Duck();
		d.sing();

	}

}
