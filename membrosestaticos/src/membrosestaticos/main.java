package membrosestaticos;

import java.util.Locale;
import java.util.Scanner;
import membrosestaticos.Calculator;

public class main {
//	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.println("Circumference: "+ Calculator.circumference(radius));
		System.out.println("Volume: " + Calculator.volume(radius));
		System.out.println("PI value: " + Calculator.PI);
		
		sc.close();
	}
//	public static double circumference(double radius){
//		return 2 * PI * radius;
//	}
//	public static double volume(double radius) {
//		return 4 * PI * Math.pow(radius, 3) / 3;
//	}

}
