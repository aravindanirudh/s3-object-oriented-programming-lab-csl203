import java.util.*;
class SymmetricMatrix {
	public static void main(String args[]) {
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		int m, n, i, j, flag = 0;
		System.out.println("Enter the order of the matrix: ");
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.println("Enter the matrix elements: ");
		for (i=0; i<m; i++) {
			for (j=0; j<n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for (i=0; i<n; i++) {
			for (j=0; j<m; j++) {
				b[j][i] = a[i][j];
			}
		}
		for (i=0; i<m; i++) {
			for (j=0; j<n; j++) {
				if (b[i][j] != a[i][j]) {
					flag++;
				}
			}
		}
		if (flag == 0) { 
			System.out.println("The matrix is symmetric!");
		}
		else {
			System.out.println("The matrix is not symmetric!");
		}
	}
}
