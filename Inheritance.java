import java.util.*;
class Employee {
	String name;
	int age, salary;
	String phone_no;
	String address;
	Employee(String name, int age, String phone_no, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phone_no = phone_no;
		this.address = address;
		this.salary = salary;
	}
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone number: " + phone_no);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
	}
}
class Officer extends Employee {
	String specialisation;
	Officer(String name, int age, String phone_no, String address, int salary, String specialisation) {
		super(name, age, phone_no, address, salary);
		this.specialisation = specialisation;
	}
	void displayOfficer() {
		super.display();
		System.out.println("Specialisaion: " + specialisation);
	}
}
class Manager extends Employee {
	String department;
	Manager(String name, int age, String phone_no, String address, int salary, String department) {
		super(name, age, phone_no, address, salary);
		this.department = department;
	}
	void displayManager() {
		super.display();
		System.out.println("Department: " + department);
	}
}
class Inheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); //Use this to input other datatypes
		Scanner scStr = new Scanner(System.in); //Use this to input String datatype only
		
		System.out.println("Enter the details of the officer");
		System.out.print("Enter the name of officer: ");
		String name = scStr.nextLine();
		System.out.print("Enter the age of officer: ");		
		int age = sc.nextInt();
		System.out.print("Enter the phone number of the officer: ");
		String phone_no = scStr.nextLine();
		System.out.print("Enter the address of the officer: ");
		String address = scStr.nextLine();
		System.out.print("Enter the salary of officer: ");
		int salary = sc.nextInt();
		System.out.print("Enter the specialisation of the officer: ");
		String specialisation = scStr.nextLine();
		Officer o = new Officer(name, age, phone_no, address, salary, specialisation);
		
		System.out.println("\nEnter the details of the manager");
		System.out.print("Enter the name of manager: ");
		String name1 = scStr.nextLine();
		System.out.print("Enter the age of manager: ");		
		int age1 = sc.nextInt();
		System.out.print("Enter the phone number of the manager: ");
		String phone_no1 = scStr.nextLine();
		System.out.print("Enter the address of the manager: ");
		String address1 = scStr.nextLine();
		System.out.print("Enter the salary of manager: ");
		int salary1 = sc.nextInt();
		System.out.print("Enter the department of the manager: ");
		String department = scStr.nextLine();
		Manager m = new Manager(name1, age1, phone_no1, address1, salary1, department);
		
		System.out.println("\nThanks for the input!");
		System.out.println("\nDetails of the officer");
		o.displayOfficer();
		System.out.println("\nDetails of the manager");
		m.displayManager();
	}
}
