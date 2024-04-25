package listas;

public class parte1 {

	public static void main(String[] args) {
		int x = 20;
		Integer obj = x;
		int y = (int) obj;
		String[] vect = new String[] {"Maria", "Joao", "Mateus"};
		
		for(String obb : vect) {
			System.out.println(obb);
		}
		
		
		String[] List2 = new String[] {"Gabriel", "Marcos", "Gustavo"};
		for(String onj : List2) {
			System.out.println(onj);
		}
		
		System.out.println(obj);
		System.out.println(y);
		
	}

}
