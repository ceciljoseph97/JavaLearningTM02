/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and 
override the eat() method to represent each fruit taste.*/


package com.Inheritance;

public class Orange extends Fruits {
	Orange(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("\nIt tastes like Orange");
	}
}
