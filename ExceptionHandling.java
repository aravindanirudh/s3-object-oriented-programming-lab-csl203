import java.util.*;
class ExceptionHandling {
	public static void main(String args[]) {
		try {
			int n = 5, i = 0;
			System.out.println(n/i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				try {
					try {
						String s = "ABC";
						int i = Integer.parseInt(s);
					}
					catch(NumberFormatException e) {
						System.out.println(e);
					}
					String ptr = null;
					if(ptr.equals("hello")) {
						System.out.println("Same");
					}
					else {
						System.out.println("Not same");
					}
				}
				catch(Exception e) {
				System.out.println(e);
				}
				int[] a = new int[5];
				a[5] = 4;
			}
				catch(Exception e) {
					System.out.println(e);
				}
			
		}
	}
}
