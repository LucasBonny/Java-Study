package atv3;
import Retangle.retangle;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangle retangle = new retangle();
		System.out.println("Enter rectangle width and height: ");
		retangle.Height = sc.nextDouble();
		retangle.Width = sc.nextDouble();
		System.out.println(retangle);
	}

}
