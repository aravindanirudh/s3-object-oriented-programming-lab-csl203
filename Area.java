import java.util.*;
class Rectangle {
	int l, b;
	void area() {
		int a;
		a = l*b;
		System.out.println("Area is: " + a);
	}
}
class Area {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length: ");
		r.l = scan.nextInt();
		System.out.print("Enter the breadth: ");
		r.b = scan.nextInt();
		r.area();
	}
}
