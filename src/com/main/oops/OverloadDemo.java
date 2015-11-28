package com.main.oops;

/*
 * Write a program to depict the behavior of method overloading.
 * @author: Manjula Acharya
 */

public class OverloadDemo {
		
		private String flower;
		private String color;
		private int count = 12;
		private double price = 19.99;
		
		//Constructor overloading
		public OverloadDemo()
		{
			this.flower = "Rose";
			this.color = "Red";
			this.count = 12;
			this.price = 19.99;
		}
		
		public OverloadDemo(String flower, String color)
		{
			this.flower = flower;
			this.color = color;
		}
		
		public OverloadDemo(String flower, String color, double price)
		{
			this.flower = flower;
			this.color = color;
			this.price = price;
		}
		
		public void getInfo()
		{
			System.out.println(this.color + " " + this.flower + " Count:" + this.count + " at $" + this.price);
		}
		

	public static void main(String[] args) {
		
		OverloadDemo d = new OverloadDemo();
		d.getInfo();
		
		OverloadDemo d1 = new OverloadDemo("Lily", "Yellow");
		d1.getInfo();
		
		OverloadDemo d2 = new OverloadDemo("Peony", "Pink", 29.99);
		d2.getInfo();

	}

}
