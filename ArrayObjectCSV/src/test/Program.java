package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";
		File file = new File(path);
		Scanner sc = null;
		List<Dominio> dominio = new ArrayList<>();
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] fields = sc.nextLine().split("	");
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dominio.add(new Dominio(fields[0], fields[1], LocalDate.parse(fields[2], fmt)));
			}
			Collections.sort(dominio);
			for(Dominio d : dominio) {
				if(d.getDominio().equals("mudar.com")) if(d.getVencimento().isAfter(LocalDate.now())) System.out.println(d);
				/*if(d.getVencimento().getYear() == 2024 || d.getVencimento().getYear() == 2025) {
					System.out.println(d);
				}*/
			}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado! \n" + path);
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
