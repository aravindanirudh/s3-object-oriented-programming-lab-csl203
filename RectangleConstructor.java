import java.util.*;
class Rectangle { 
	int l, b;
	Rectangle() {
		l = 2;
		b = 3;
	}
	void area() {
		int a = l * b;
		System.out.println("The area is: " + a);
	}
}
class RectangleConstructor {
	public static void main(String args[]) {
	Rectangle r = new Rectangle();
	r.area();
	}
}
