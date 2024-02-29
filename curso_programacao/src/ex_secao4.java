import java.util.Locale;
import java.util.Scanner;
public class ex_secao4 {

	public static void main(String[] args) {
		//EXERCICIO 1
//		Scanner sc = new Scanner(System.in);
//		int valor1 = sc.nextInt();
//		int valor2 = sc.nextInt();
//		int total = valor1 + valor2;
//		System.out.println("SOMA = " + total);
//		sc.close();
		
		//EXERCICIO 2
		//area = pi .raio elevado a 2
//		Locale.setDefault(Locale.US);
//		double area, raio, pi = 3.14159;
//		Scanner sc = new Scanner(System.in);
//		raio = sc.nextDouble();
//		area = pi * (Math.pow(raio, 2));
//		System.out.printf("A=%.4f", area);
//		sc.close();
		
		//EXERCICIO 3
//		int A, B, C, D, dif;
//		Scanner sc = new Scanner(System.in);
//		A = sc.nextInt();
//		B = sc.nextInt();
//		C = sc.nextInt();
//		D = sc.nextInt();
//		
//		dif = (A * B - C * D);
//		
//		System.out.println("DIFERENCA = " + dif);
//		
//		sc.close();
		
		//EXERCICIO 4
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		double hrs = sc.nextDouble();
//		double ph = sc.nextDouble();
//		
//		System.out.println("NUMBER = " + num);
//		System.out.printf("SALARY = U$ %.2f\n", hrs * ph);
		
		//EXERCICIO 5
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		int id1 = sc.nextInt();
//		int qnt1 = sc.nextInt();
//		double vu1 = sc.nextDouble();
//		int id2 = sc.nextInt();
//		int qnt2 = sc.nextInt();
//		double vu2 = sc.nextDouble();
//		
//		
//		System.out.printf("VALOR A PAGAR: %.2f", (qnt1 * vu1) + (qnt2 * vu2));
//		sc.close();
		
		
		//EXERCICIO 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
		System.out.printf("CIRCULO: %.3f\n", C * C * 3.14159);
		System.out.printf("TRAPEZIO: %.3f\n", ((A + B) / 2.0) * C);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RETANGULO: %.3f\n", A * B);
		sc.close();
	}

}
