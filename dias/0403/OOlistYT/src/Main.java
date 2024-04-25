import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Program;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Program> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Program emp = new Program(id, name, salary);
			
			list.add(emp);
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
		
		sc.close();
	}
	Integer position(List<Program> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
