package TesteHorarios;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Clock {

	public String conversor(Instant instant) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return instant.toString().formatted(dtf);
	}
}
