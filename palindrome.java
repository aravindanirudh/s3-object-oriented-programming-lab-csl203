import java.util.Scanner;
class palindrome {
	public static void main(String args[]) {
		int rem, rev=0, temp, n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		n = scan.nextInt();
		temp = n;
		while (n > 0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		if(temp == rev) {
			System.out.println("The number " + temp + " is palindrome!");
		}
		else {
			System.out.println("The number " + temp + " is not palindrome!");
		}
	}
}
