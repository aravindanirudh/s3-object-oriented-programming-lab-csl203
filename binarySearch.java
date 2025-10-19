import java.util.*;
class binarySearch {
	static void binarysearch(int a[], int n, int key) {
		int low = 0;
		int high = n - 1;
		int mid;
		int flag = 0;
		while (low <= high) {
			mid = (low + high)/2;
			if(a[mid] == key) {
				System.out.println("The element was found at position " + (mid+1));
				flag = 1;
				break;
			}
			else if (a[mid] < key) {
				low = mid + 1; 
			}
			else {
				high = mid - 1;
			}
		}
		if (flag == 0) {
			System.out.println("The element was not found!");
		}
	}
	public static void main(String args[]) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements in ascending order: ");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the item to be searched: ");
		int key = sc.nextInt();
		binarysearch(a, n, key);
	}
}
