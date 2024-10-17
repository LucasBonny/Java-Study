import java.util.Locale;
import java.util.Scanner;

public class ex_secao5 {

	public static void main(String[] args) {
		//EXERCICIO 1 FACIL
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num >= 0) System.out.println("NAO NEGATIVO");
//		else System.out.println("NEGATIVO");
//		sc.close();
		//EXERCICIO 2 FACIL
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num % 2 == 0) System.out.println("PAR");
//		else System.out.println("IMPAR");
//		sc.close();
		//EXERCICIO 3 DIFICIL
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		if (A % B == 0 || B % A == 0) System.out.println("Sao Multiplos");
//		else System.out.println("Nao Sao Multiplos");
//		sc.close();
		//EXERCICIO 4 MEDIANA
//		Scanner sc = new Scanner(System.in);
//		int h1 = sc.nextInt();
//		int h2 = sc.nextInt();
//		if(h1 < h2) {
//			int total = (h2 - h1);
//			System.out.println("O JOGO DUROU " + total + " HORA(S)");
//		}
//		else {
//			int total = (h2 - h1) + 24;
//			System.out.println("O JOGO DUROU " + total + " HORA(S)");
//		}
		//EXERCICIO 5 FACIL
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		double qnt = sc.nextInt();
//		if(id == 1) System.out.printf("Total: R$ %.2f", qnt * 4);
//		else if(id == 2) System.out.printf("Total: R$ %.2f", qnt * 4.5);
//		else if(id == 3) System.out.printf("Total: R$ %.2f", qnt * 5);
//		else if(id == 4) System.out.printf("Total: R$ %.2f", qnt * 2);
//		else System.out.printf("Total: R$ %.2f", qnt * 1.5);
//		sc.close();
		//EXERCICIO 6 FACIL
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double nf = sc.nextDouble();
//		if(nf >= 0 && nf <= 25) System.out.println("Intervalo [0,25]");
//		else if (nf >= 25 && nf <= 50) System.out.println("Intervalo [25,50]");
//		else if (nf >= 50 && nf <= 75) System.out.println("Intervalo [50,75]");
//		else if (nf >= 75 && nf <= 100) System.out.println("Intervalo [75,100]");
//		else System.out.println("Fora de intervalo");
//		sc.close();
		//EXERCICIO 7 MEDIANA
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		if(x > 0 && y > 0) System.out.println("Q1"); 
//		else if(x > 0 && y < 0) System.out.println("Q4"); 
//		else if(x < 0 && y > 0) System.out.println("Q2"); 
//		else if(x < 0 && y < 0) System.out.println("Q3"); 
//		else System.out.println("Origem");
//		sc.close();
		//EXERCICIO 8 COMPLEXO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		if(salary <= 2000.00) System.out.println("Isento");
		else if(salary <= 3000.00) {
			double total = (salary - 2000) * 0.08;
			System.out.printf("R$ %.2f", total);
		}
		else if(salary >= 3000.01 && salary <= 4500) {
			double total = ((salary - 3000) * 0.18) + 80;
			System.out.printf("R$ %.2f", total);
		}
		else {
			double total = ((salary - 4500) * 0.28) +  270 + 80;
			System.out.printf("R$ %.2f", total);
		}
		sc.close();
	}

}
