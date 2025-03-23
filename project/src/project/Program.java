package project;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Client> emp = new ArrayList<>();
		emp.add(new Client("Alex","alex@gmail.com"));
		emp.add(new Client("Alex","alex@gmail.com"));
		emp.add(new Client("Alex","alex@gmail.com"));
		emp.add(new Client("Alex","alex@gmail.com"));
		emp.add(new Client("Alex","alex@gmail.com"));
		emp.add(new Client("Maria","maria@gmail.com"));

		int result = Search.result(emp, new Client("Maria", "maria@gmail.com"));
		if(result < 0) {
			System.out.println("Não existe um valor na lista com esses dados!");
		}
		else {
			System.out.println("Existe na lista: " + result);
		}		
		

	}

}
