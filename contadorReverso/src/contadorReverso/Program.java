package contadorReverso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    	//while do alfabeto
    	Scanner sc = new Scanner(System.in);
    	int qnt = sc.nextInt();
    	List<Character> alfabeto = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
    			'J', 'K', 'L', 'M', 'N', 'O', 'P','Q','R','S','T','U','V','W','X','Y','Z'));
    	while(qnt < alfabeto.size()) {
    		alfabeto.remove(alfabeto.get(alfabeto.size() -1));
    	}
    	System.out.println(alfabeto);
    	sc.close();
    }
}
