package bank;

import java.util.Locale;
import java.util.Scanner;

import account.User;

public class Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int setAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String setName = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		User user = new User(setAccount, setName);
		if(initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			user = new User(setAccount, setName, initialDeposit);
		}
		System.out.println("\nAccount data: ");
		System.out.println(user);

		System.out.print("\nEnter a deposit value: ");
		user.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		System.out.print("\nEnter a withdraw value: ");
		user.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(user);
		sc.close();
	}

}
