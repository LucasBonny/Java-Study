package menu;

import java.util.Scanner;

public class Menu {
	
	private int menu;
	
	public String Funcao() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Digite uma opção: \n1: Teste 1\n2: Teste 2\n0: Fechar.\n\nInsira: ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("\n\ntestando 123 123 1\n\n");
				break;
			case 0:
				menu = 0;
				break;
			default:
				System.out.println("Digito Inválido. Tente Novamente: ");
				System.out.print("Digite uma opção: \n1: Teste 1\n2: Teste 2\n0: Fechar.\n\nInsira: ");
				menu = sc.nextInt();
				break;
			}
			
		} while (menu != 0);
		sc.close();
		return "Fechando...\n";
	}
}
