package exc99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import pessoa.Info;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Info> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d: \nID: ", i+1);
			int id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Info emp = new Info(id, name, salary);
			list.add(emp);
		}
		sc.close();
	}

}
