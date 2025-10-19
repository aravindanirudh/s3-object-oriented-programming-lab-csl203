package cs;
import java.util.*;
import mca.*;
class PackageExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); //To scan all other datatypes
		Scanner scStr = new Scanner(System.in); //To scan 'string' type datatype
		int rollNo, age, m1, m2, m3; String name, phoneNo;
		System.out.print("Enter the roll number: ");
		rollNo = sc.nextInt();
		System.out.print("Enter the name: ");
		name = scStr.nextLine();
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		System.out.print("Enter the phone number: ");
		phoneNo = scStr.nextLine();
		System.out.print("Enter the marks of 3 subjects: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		Student st = new Student(rollNo, name, age, phoneNo, m1, m2, m3);
		st.display();
		st.calc();
	}
}
