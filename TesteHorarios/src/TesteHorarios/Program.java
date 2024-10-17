package TesteHorarios;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		Clock dia = new Clock();
		
		Instant instant = Instant.now();
		System.out.println(instant.plus(12, ChronoUnit.MINUTES));
		System.out.println(dia.conversor(instant));

	}

}
