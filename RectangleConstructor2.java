import java.util.*;
class Rectangle { 
	int l, b;
	Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	void area() {
		int a = l * b;
		System.out.println("The area is: " + a);
	}
}
class RectangleConstructor2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the length: ");
	int l = sc.nextInt();
	System.out.print("Enter the breadth: ");
	int b = sc.nextInt();
	Rectangle r = new Rectangle(l, b);
	r.area();
	}
}
