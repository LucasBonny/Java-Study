package calculadora;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voce deseja fazer um calculo? S/N");
		char res = sc.nextLine().charAt(0);
		while(res == 'S' || res == 's') {
			System.out.print("Insira um valor: ");
			int n1 = sc.nextInt();
			System.out.print("Insira o segundo valor: ");
			int n2 = sc.nextInt();
			System.out.println("O seu resultado é: " + (n1 + n2));
			sc.nextLine();
			System.out.println("Voce deseja fazer outro calculo? S/N");
			res = sc.nextLine().charAt(0);
		}
		System.out.println("Voce encerrou o programa!");
	}

}
