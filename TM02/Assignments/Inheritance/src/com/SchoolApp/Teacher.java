/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
 and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 

Create a class called College Student that inherits from Student class. 
This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.*/

package com.SchoolApp;

public class Teacher extends Person{
	private double salary;
	private String subject;
	public Teacher(String name, String dob,String subject,double salary) {
		super(name, dob);
		this.salary=salary;
		this.subject=subject;
		
		
		
	}
	public void setSalary(double salary) {
		this.salary=salary;
		
	}
	public void setSubject(String subject) {
		this.subject=subject;
		
	}
	public String getSubject() {
		return this.subject;
	}
	public double getSalary() {
		return this.salary;
	}
	@Override 
	public String toString() {
		return "Teacher";
	}
	

}
