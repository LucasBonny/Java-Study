import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		System.out.println("Que horas são?");
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		if (hr >= 0 && hr <= 12){
			System.out.println("Bom Dia!");
		}
		else if(hr >= 13 && hr <= 17) {
			System.out.println("Boa Tarde!");
		}
		else if(hr >= 18 && hr <= 23) {
			System.out.println("Boa Noite!");
		}
		else {
			System.out.println("Formato Incorreto!");
		}
		sc.close();
	}

}
