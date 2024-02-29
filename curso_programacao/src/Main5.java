import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 0;
		while(num != 0) {
			total += num;
			num = sc.nextInt();
		}
		System.out.println(total);
		sc.close();
	}
}
