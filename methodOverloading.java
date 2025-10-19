import java.util.*;
class Area {
	double	 ar;
	//Area of Rectangle
	double area(int l, int b) {
		ar = l * b;
		return ar;
	}
	//Area of Circle
	double area(double r) {
		double pi = (22/7);
		ar = pi * r * r; 
		return ar;
	}
	//Area of Triangle
	double area(double base, double altitude) {
		ar = 0.5 * base * altitude;
		return ar;
	}
}
class methodOverloading {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Area af = new Area();
		double d1, d2;
		double a; int dim1, dim2;
		System.out.println("Welcome to the area calculator!");
		System.out.println("Enter 1 for Rectangle, 2 for Circle and 3 for Triangle: ");
		int select = sc.nextInt();
		switch (select) { 
			case 1: System.out.println("Enter the length and breadth of rectangle: ");
				dim1 = sc.nextInt();
				dim2 = sc.nextInt();
				a = af.area(dim1, dim2);
				System.out.println("The area is: " + a);
				break;
			case 2: System.out.println("Enter the radius of circle: ");
				d1 = sc.nextFloat();
				a = af.area(d1);
				System.out.println("The area is: " + a);
				break;
			case 3: System.out.println("Enter the base and altitude of triangle: ");
				d1 = sc.nextDouble();
				d2 = sc.nextDouble();
				a = af.area(d1, d2);
				System.out.println("The area is: " + a);
				break;
			default: System.out.println("Wrong input!");
		}
	}
}
