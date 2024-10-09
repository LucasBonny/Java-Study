package OnlinesPainel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\lucas\\OneDrive\\Documentos\\Projetos Java\\onlines.txt");
		Scanner sc = new Scanner(file);
		
		String linha = sc.nextLine();
		String online = linha.replace("[", "");
		String online2 = online.replace("]", "");
		String online3 = online2.replace("},{", "}\n{");
		List<String> onlines = new ArrayList<>();
		
		Scanner sc2 = new Scanner(online3);
		
		while(sc2.hasNextLine()) {
			onlines.add(sc2.nextLine());
			System.out.println(sc2.nextLine());
		}
		System.out.println(onlines.size());
	}

}
