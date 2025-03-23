package application;

import java.util.ArrayList;
import java.util.List;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		//list of employee
		List<Person> emp = new ArrayList<>();
		emp.add(new Person("Lucas Bonny", 1790.00, "lucasbonnyb8@gmail.com"));
		emp.add(new Person("Gabriel Soares", 1290.00, "gabrielsoares@gmail.com"));
		emp.add(new Person("Maria Vitória", 2300.00, "mariavick@gmail.com"));
		emp.add(new Person("Antônio Souza", 6420.00, "antoniosouza@gmail.com"));
		emp.add(new Person("Mario Santos", 1790.00, "mariosantos@gmail.com"));
		
		for(Person p : emp) {
			p.hashCode();
		}
		
	}

}
