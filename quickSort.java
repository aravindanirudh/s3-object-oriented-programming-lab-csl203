import java.util.*;
public class quicksort {
    static int partition(int a[], int low, int high) {
        int s = high;
        int b = low;
        int pivotindex = low;
        int temp;
        while (s > b) {
            while (a[b] <= a[pivotindex] && b < high) {
                b++;
            }
            while (a[s] > a[pivotindex]) {
                s--;
            }
            if (s > b) {
                temp = a[s];
                a[s] = a[b];
                a[b] = temp;
            }
        }
        temp = a[s];
        a[s] = a[pivotindex];
        a[pivotindex] = temp;
        return s;
    }

    static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int q = partition(a, low, high);
            quicksort(a, low, q - 1);
            quicksort(a, q + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int n, i;
        
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        
        System.out.print("Enter the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        quicksort(a, 0, n - 1);
        
        System.out.print("The sorted elements are: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}