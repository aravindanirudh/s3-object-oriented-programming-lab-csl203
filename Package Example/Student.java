package mca;
import java.util.*;
public class Student {
	int rollNo, age, m1, m2, m3;
	String name, phoneNo;
	public Student(int rollNo, String name, int age, String phoneNo, int m1, int m2, int m3) {
	 	this.rollNo = rollNo;
	 	this.name = name;
	 	this.age = age;
	 	this.phoneNo = phoneNo;
	 	this.m1 = m1;
	 	this.m2 = m2;
	 	this.m3 = m3;
	 }	
	 public void display() {
	 	System.out.println("Roll number is: " + rollNo);
	 	System.out.println("Name is: " + name);
	 	System.out.println("Age is: " + age);
	 	System.out.println("Phone number is: " + phoneNo);
	 	System.out.println("Marks of 3 subjects are respetively: " + m1 + " " + m2 + " " + m3);
	 }
	 public void calc() {
	 	int totalMark = m1 + m2 + m3;
	 	System.out.println("The total mark is: " + totalMark);
	 	float markPercentage = ((float)(m1 + m2 + m3)/300) * 100;
	 	System.out.println("The percentage is: " + markPercentage);
	 }
}
