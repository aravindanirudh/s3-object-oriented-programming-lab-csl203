class factorial {
	public static void main(String args[]) {
		int n, i, fact = 1;
		System.out.println("Enter a number whose factorial is to be found: ");
		n = Integer.parseInt(args[0]);
		for(i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("The factorial is: " + fact);
	}
}
