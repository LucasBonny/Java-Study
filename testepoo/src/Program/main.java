package Program;
import java.util.Locale;
import java.util.Scanner;

import Class.poo;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		poo x,y;
		x = new poo();
		y = new poo();
		x.x = 10;
		x.y = 10;
		y.x = 5;
		y.y = 5;
		double xres = x.x + x.y;
		double yres = y.x + y.y;
		
		System.out.println(xres);
		System.out.println(yres);
		sc.close();
	}

}
