import java.util.*;
class frequencyCharacter {
	public static void main(String args[]) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		System.out.print("Enter a character whose frequency has to be checked: ");
		char ch = scan.nextLine().charAt(0);
		int l = str.length();
		for (int i = (l - 1); i >= 0; i--) {
			if (str.charAt(i) == ch) {
				count++;
			} 
		}
		if (count == 0) {
			System.out.println("Character not found!");
		}
		else {
			System.out.println("The frequency of the character " + ch + " in the string is " + count);
		}
	}
}
