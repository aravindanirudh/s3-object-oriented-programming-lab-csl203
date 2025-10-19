import java.util.*;
abstract class Shape {
	abstract void numberOfSides();
}
class Triangle extends Shape {
	void numberOfSides() {
		System.out.println("Triangle has 3 sides");
	}
}
class Rectangle extends Shape {
	void numberOfSides() {
		System.out.println("Rectangle has 4 sides");
	}
}
class Hexagon extends Shape {
	void numberOfSides() {
		System.out.println("Hexagon has 6 sides");
	}
}
class Abstract {
	public static void main(String args[]) {
		Triangle ob1 = new Triangle();
		Rectangle ob2 = new Rectangle();
		Hexagon ob3 = new Hexagon();
		ob1.numberOfSides();
		ob2.numberOfSides();
		ob3.numberOfSides();
	}
}
