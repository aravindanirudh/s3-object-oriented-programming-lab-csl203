import java.util.*;
class matrixMultiplication {
	public static void main(String args[]) {
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		int m, n, p, q, i, j, k;
		System.out.print("Enter the order of first matrix: ");
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.print("Enter the order of second matrix: ");
		p = scan.nextInt();
		q = scan.nextInt();
		if (n!=p) {
			System.out.println("Matrices cannot be multiplied!");
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
				for (j=0; j<q; j++) {
					c[i][j] = 0;
					for (k=0; k<n; k++) { 
						
						c[i][j] += a[i][k] * b[k][j];  
					}
				}
			}
			System.out.println("The product of matrices is: ");
			for (i=0; i<m; i++) {
				for (j=0; j<q; j++) {
					System.out.print(c[i][j] + " ");
				}
			System.out.println("");
			}
		}
	}
}

