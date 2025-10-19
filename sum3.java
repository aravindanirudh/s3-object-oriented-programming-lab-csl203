import java.util.Scanner;
class sum3 {
	public static void main(String args[]) {
		int a, b, s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = scan.nextInt();
		System.out.println("Enter the second number: ");
		b = scan.nextInt();
		s = a + b;
		System.out.println("The sum is " + s);
	}
}
