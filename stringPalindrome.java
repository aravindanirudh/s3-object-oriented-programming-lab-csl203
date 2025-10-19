import java.util.*;
class stringPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int l = str.length();
		String rev="";
		for (int i = (l - 1); i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("The string is palindrome!");
		}
		else {
			System.out.println("The string is not palindrome!");
		}
	}
}
