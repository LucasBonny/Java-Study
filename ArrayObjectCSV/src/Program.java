import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		String path = "C:\\OneDriveTemp\\in.txt";
		File file = new File(path);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = null; //precisa ser passado fora do try? Sim, para ser usado no finally!
		List<Employee> f = new ArrayList<>();

		try {
			sc = new Scanner(file); //pegando a informação dentro do arquivo
			sc.nextLine();//já remove a mensagem  nome,email,dataNasc,telefone do csv
			while(sc.hasNextLine()) {
				String[] func = sc.nextLine().split(",");
				f.add(new Employee(func[0], func[1], LocalDate.parse(func[2], fmt), func[3]));
			}
			Collections.sort(f);
			for(int i = 0; i < f.size(); i ++) {
				System.out.println(f.get(i));
			}
		}
		catch(IOException e) {
			System.out.println("Erro na leitura no diretório: " + path);
			e.getStackTrace();
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
