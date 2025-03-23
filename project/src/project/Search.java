package project;

import java.util.List;

public class Search {

	public static final <T extends Comparable<T>> int result(List<T> emp, T client) {
		for(int i = 0; i < emp.size();i++) {
			if(emp.get(i).hashCode() == client.hashCode()) {
				if(emp.get(i).equals(client)) {
					return i;
				}
			}
		}
		return -1;
		
	}
}
