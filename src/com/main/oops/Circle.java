package com.main.oops;

/*
 * Write a program that creates a class Circle extending Shape abstract class and 
 * implementing ShapeConstants interface and has following behavior.
 * 			--> Properties: radius.
 *			--> Constructor: To set number of sides.
 *			--> Overrides all the methods from parents.
 * @author: Manjula Acharya
 */

public class Circle extends Shape implements ShapeConstants{
	
	private final double radius;
	
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	

	@Override
	public double calculateArea() 
	{
		return(this.area = (ShapeConstants.PI * Math.pow(radius, 2)));
	}

	@Override
	public double calculatePerimeter()
	{
		return(this.perimeter = (2 * (ShapeConstants.PI) * radius));
	}

	@Override
	public void setSides() 
	{
		this.noOfSides = 0;
	}
	
	
	public static void main(String[] args) {
		Circle dot = new Circle(5);
		System.out.println("Perimeter of circle: " + dot.calculatePerimeter());
		System.out.println("Area of circle: " + dot.calculateArea());

	}

}
