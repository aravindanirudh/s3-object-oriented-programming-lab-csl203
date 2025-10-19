import java.util.*;
class matrixAddition {
	public static void main(String args[]) {
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		int m, n, p, q, i, j;
		System.out.print("Enter the order of first matrix: ");
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.print("Enter the order of second matrix: ");
		p = scan.nextInt();
		q = scan.nextInt();
		if (m!=p || n!=q) {
			System.out.println("Order of both matrices must be same!");
		}
		else {
			System.out.print("Enter the first matrix: ");
			for (i=0; i<m; i++) {
				for (j=0; j<n; j++) {
					a[i][j] = scan.nextInt();
				}
			}
			System.out.print("Enter the second matrix: ");
			for (i=0; i<p; i++) {
				for (j=0; j<q; j++) {
					b[i][j] = scan.nextInt();
				}
			}
			for (i=0; i<m; i++) {
				for (j=0; j<n; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println("The sum of matrices is: ");
			for (i=0; i<m; i++) {
				for (j=0; j<n; j++) {
					System.out.print(c[i][j] + " ");
				}
			System.out.println("");
			}
		}
	}
}
