package ReadFile;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class teste {

	public static void main(String[] args) {
		
		try {
			Locale.setDefault(Locale.US);
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Instant ld = Instant.parse("13/05/2001");
			LocalDate atual = LocalDate.now();
			
			//Duration duracao = Duration.between(ld, atual);
			
			System.out.println(ld);
			
			
		}
		catch (RuntimeException e) {
			System.out.println("Erro desconhecido!");
			e.printStackTrace();
		}
	}

}
