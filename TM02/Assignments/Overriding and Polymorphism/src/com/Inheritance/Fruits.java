/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and 
override the eat() method to represent each fruit taste.*/


package com.Inheritance;

public class Fruits {
	private String name;
	private String taste;
	private int size;
	Fruits(String name,String taste,int size){
		this.name=name;
		this.size=size;
		this.taste=taste;
	}
	public void eat() {
		System.out.printf("%s tastes like %s",name, taste);
	}
}
