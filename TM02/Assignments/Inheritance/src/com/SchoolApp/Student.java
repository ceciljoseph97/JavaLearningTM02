/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
 and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 

Create a class called College Student that inherits from Student class. 
This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.*/


package com.SchoolApp;

public class Student extends Person {
	private int studentId;
	public Student(String name, String dob, int studentId) {
		super(name, dob);
		this.studentId=studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
		
	}
	public int getStudentId() {
		return this.studentId;
	}
	@Override
	public String toString() {
		return "Student "+studentId+"\t"+getName();
	}
	
}
