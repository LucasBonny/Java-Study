package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Set<Integer> student = new HashSet<>();	
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			student.add(sc.nextInt());
		}
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for(int i = 0; i < b; i++) {
			student.add(sc.nextInt());
		}
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for(int i = 0; i < c; i++) {
			student.add(sc.nextInt());
		}
		System.out.println("Total students: " + student.size());
		
		
		sc.close();

	}

}
