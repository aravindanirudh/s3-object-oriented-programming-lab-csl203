import java.util.*;
class Student {
	String name;
	int roll;
	float cgpa;
	void result() {
		Change c = new Change();
		if(cgpa >= 5) {
			System.out.println("Passed!");
		}
		else {
			System.out.println("Failed!");
			c.update();
		}
	}
	class Change {
		void update() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the incremented value: ");
			float inc = sc.nextFloat();
			cgpa = cgpa + inc;
			result();
		}
	}
}
class nestedClass{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter the name: ");
		s.name = sc.nextLine();
		System.out.println("Enter the roll number: ");
		s.roll = sc.nextInt();
		System.out.println("Enter the CGPA: ");
		s.cgpa = sc.nextFloat();
		s.result();
	}
}
