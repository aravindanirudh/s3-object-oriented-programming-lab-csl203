import java.util.*;
class stringTokenizer {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string of integers with one space: ");
		String str = sc.nextLine();
		int sum = 0;
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.print("Integers are: ");
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.print(s + " ");
			int i = Integer.parseInt(s);
			sum = sum + i;
		}
		System.out.println("Sum is: " + sum);
	}
}
