import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int soma = 0;
		for(int i = 0; i < num; i++) {
			int X = sc.nextInt();
			soma += X;
		}
		System.out.println(soma);
		sc.close();

	}

}
