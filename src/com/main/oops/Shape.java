package com.main.oops;

/*
* Write a program creating an abstract class Shape with properties (noOfSides, area, perimeter) 
* and methods(calculateArea, calculatePerimeter, setSides)
* 
* @author: Manjula Acharya
*/

public abstract class Shape {
	
	protected int noOfSides;
	protected double area;
	protected double perimeter;
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract void setSides();
}
