/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and 
override the eat() method to represent each fruit taste.*/

package com.Inheritance;

public class FruitTaste {

	public static void main(String[] args) {
		
		Fruits f=new Fruits("Banana","Sweet",16);
		f.eat();
		Orange o=new Orange("Orange","Sour",5);
		o.eat();
		Apple a=new Apple("Apple","Honey",6);
		a.eat();
	}

}
