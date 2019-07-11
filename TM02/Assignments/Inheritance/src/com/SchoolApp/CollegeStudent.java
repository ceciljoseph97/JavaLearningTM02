/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
 and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 

Create a class called College Student that inherits from Student class. 
This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.*/


package com.SchoolApp;

public class CollegeStudent extends Student {
	private String collegeName;
	private String yearOfStudy;
	public CollegeStudent(String name, String dob, int studentId,String collegeName,String yearOfStudy) {
		super(name, dob, studentId);
		this.yearOfStudy=yearOfStudy;
		this.collegeName=collegeName;
	}
	

}
