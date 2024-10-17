package AtividadeException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Bank;
import model.exceptions.NotEnoughValue;
import model.exceptions.WithdrawValue;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double iLimit = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double wLimit = sc.nextDouble();
			Bank user = new Bank(number, holder, iLimit, wLimit);
			
			System.out.print("Enter amount for withdraw: ");
			user.withdraw(sc.nextDouble());
		}
		catch (InputMismatchException e){
			System.out.println("Input Error!");
		}
		catch(WithdrawValue e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(NotEnoughValue e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro Indefinido!");
		}
		sc.close();
	}

}
