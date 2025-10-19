import java.util.*;
interface Bank {
	void getRateOfInterest();
}
class BankA implements Bank {
	public void getRateOfInterest() {
		System.out.println("The interest rate of Bank A is 10.09%");
	}
}
class BankB implements Bank {
	public void getRateOfInterest() {
		System.out.println("The interest rate of Bank B is 17.59%");
	}
}
class BankC implements Bank {
	public void getRateOfInterest() {
		System.out.println("The interest rate of Bank C is 15.43%");
	}
}
class Interface {
	public static void main(String args[]) {
		BankA bA = new BankA();
		BankB bB = new BankB();
		BankC bC = new BankC();
		bA.getRateOfInterest();
		bB.getRateOfInterest();
		bC.getRateOfInterest();
	}
}
