import java.util.*;  
class Student {
	String name;
	int sub1, sub2, sub3, age, rollNo;	
	void display() {
		int totalMarks;
		totalMarks = sub1 + sub2 + sub3;
		System.out.println("Name: " + name);	
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Age: " + age);
		System.out.println("Marks of subject 1: " + sub1);
		System.out.println("Marks of subject 2: " + sub2);
		System.out.println("Marks of subject 3: " + sub3);
		System.out.println("Total marks of 3 subjects: " + totalMarks);
	}
}
class studentDetailsCls {
	public static void main(String args[]) {
		Student	st = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		st.name = sc.nextLine();
		System.out.print("Enter the roll number: ");
		st.rollNo = sc.nextInt();
		System.out.print("Enter the age: ");
		st.age = sc.nextInt();
		System.out.print("Enter the marks of subject 1: ");
		st.sub1 = sc.nextInt();
		System.out.print("Enter the marks of subject 2: ");
		st.sub2 = sc.nextInt();
		System.out.print("Enter the marks of subject 3: ");
		st.sub3 = sc.nextInt();
		st.display();
	}
}
