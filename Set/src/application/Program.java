package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));

		//set.removeIf(x -> x.charAt(0) == 'T'); 
		//set.removeIf(x -> x.length() >= 3);
		set.remove("Tablet");
		
		for(String g : set) {
			System.out.println(g);
		}
	}

}
