/*Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String.
Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.


*/
package com.testEmployee;

public class Employee extends person {
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	@Override
	public String getName() {
		return pName;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo + ", name=" + pName + "]";
	}
}
