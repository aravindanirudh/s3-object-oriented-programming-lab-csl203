import java.util.*;
class Employee {
	void display() {
		System.out.println("Name of the class is Employee");	
	}
	void calcSalary() {
		System.out.println("Salary of the employee is 10,000");
	}
}
class Engineer extends Employee {
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("Name of the class is Engineer");
	}
	void calcSalary() {
		System.out.println("Salary of the employee is 20,000");
	}
}
class Inheritance2 {
	public static void main(String args[]) {
		Engineer e = new Engineer();
		e.display();
		e.calcSalary();
	}
}
