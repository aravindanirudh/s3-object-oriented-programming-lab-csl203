import java.util.Scanner;
class studentDetails {
	public static void main(String args[]) {
		int sub1, sub2, sub3, totalMarks, rollNo;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = scan.nextLine();
		System.out.println("Enter the roll number: ");
		rollNo = scan.nextInt();
		System.out.println("Enter the marks of subject 1: ");
		sub1 = scan.nextInt();
		System.out.println("Enter the marks of subject 2: ");
		sub2 = scan.nextInt();
		System.out.println("Enter the marks of subject 3: ");
		sub3 = scan.nextInt();
		totalMarks = sub1 + sub2 + sub3;
		System.out.println("Name is: " + name);
		System.out.println("Roll number: " + rollNo);
		System.out.println("Total mark: " + totalMarks);
	}
}
