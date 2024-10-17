package generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		try {
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int i= 0, qnt = sc.nextInt();
		
		while(i < qnt) {
			ps.addValue(sc.next());
			i++;
		}
		
		ps.print();
		System.out.println("First: "+ ps.first());
		}
		catch(IllegalStateException e){
			System.out.println("A lista está vazia!");
		}
		finally {
			sc.close();
			
		}
	}

}
