import java.util.*;
class Volume { 
	int l, b, h;
	Volume(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	void volume() {
		int a = l * b * h;
		System.out.println("The area is: " + a);
	}
}
class VolumeConstructor {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the length: ");
	int l = sc.nextInt();
	System.out.print("Enter the breadth: ");
	int b = sc.nextInt();
	System.out.print("Enter the height: ");
	int h = sc.nextInt();
	Volume r = new Volume(l, b, h);
	r.volume();
	}
}
