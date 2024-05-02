package timezone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.time.Duration;

public class Main1 {

	public static void main(String[] args) {

		//LocalDateTime.parse();
		//LocalDate.now();
		//Instant
		//LocalDateTime.of();
		//DateTimeFormatter.ofPattern();
		
//		LocalDate d01 = LocalDate.now();
//		System.out.println(d01);
//		
//		LocalDateTime d02 = LocalDateTime.now();
//		System.out.println(d02);
//		
//		Instant d03 = Instant.now();
//		System.out.println(d03);
//		
//		LocalDate d04 = LocalDate.parse("2024-05-13");
//		System.out.println(d04);
//		
//		LocalDateTime d05 = LocalDateTime.parse("2001-05-13T14:30:01.93724600");
//		System.out.println(d05);
//		
//		Instant d06 = Instant.now();
//		System.out.println(d06);
//
//		Instant d07 = Instant.parse("2024-05-13T14:28:57.2345Z");
//		System.out.println(d07);
//		
//		Instant d08 = Instant.parse("2024-05-13T14:28:57.2345-03:00");
//		System.out.println(d08);
//		
//		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
//		LocalDateTime d09 = LocalDateTime.parse("2001/05/13 13:12", fm1);
//		System.out.println(d09);
//
//		LocalDate d10 = LocalDate.of(2001, 5, 13);
//		System.out.println(d10);
//		
//		LocalDateTime d11 = LocalDateTime.of(2001, 5 ,13, 17, 11, 22);
//		System.out.println(d11);
		
		//TIMEZONE TESTE
		
//		LocalDate d01 = LocalDate.now();
//		System.out.println(d01);
//		
//		LocalDateTime d02 = LocalDateTime.now();
//		System.out.println(d02);
//		
//		LocalDateTime d03 = LocalDateTime.parse("2022-05-14T12:42:56");
//		System.out.println(d03);
//
//		//parse tem sobrecarga.
//		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//		LocalDateTime d04 = LocalDateTime.parse("23/05/2022 13:55:23", fm1); //faltou especificar aqui o formato...
//		System.out.println(fm1.format(d04));
//
//		LocalDateTime d05 = LocalDateTime.of(2022, 05, 13, 13, 44);
//		System.out.println(d05);
//		
//		
//		LocalDate d06 = LocalDate.of(2022, 05, 13);
//		System.out.println(d06);
//		
//		//formatar d03
//		
//		System.out.println(d03);
//		System.out.println(d03.format(fm1));
//		
		

		///////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		parte 2
		
//		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate d04 = LocalDate.parse("2022-05-14");
//		LocalDateTime d05 = LocalDateTime.parse("2022-05-14T01:42:56");
//		Instant d06 = Instant.parse("2022-05-14T01:42:56Z");
//		
////		for(String s : ZoneId.getAvailableZoneIds()) {
////			System.out.println(s);
////		}
//
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
//		System.out.println("r1 = " + fm1.format(r1));
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
//		System.out.println("r1 = " + fm1.format(r2));
//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
//		System.out.println("r1 = " + fm1.format(r3));
//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		System.out.println("r1 = " + fm1.format(r4));
//
//		System.out.println(d04.getDayOfMonth());
//		System.out.println(d04.getMonthValue());
//		System.out.println(d04.getYear());
//		System.out.println(d05.getHour());
//		System.out.println(d05.getMinute());
		

		///////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//parte 3
		LocalDate d03 = LocalDate.now();
		LocalDate d04 = LocalDate.parse("2022-05-14");
		LocalDateTime d05 = LocalDateTime.parse("2022-05-14T01:42:56");
		Instant d06 = Instant.parse("2022-05-14T01:42:56Z");
//		
//		LocalDate pastWeekLocalDate = d04.minusDays(7);
//		LocalDate nextWeekLocalDate = d04.plusDays(7);
//		System.out.println(d04);
//		System.out.println(pastWeekLocalDate);
//		System.out.println(nextWeekLocalDate);
		
//		LocalDate dataCreate = LocalDate.now();
//		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		System.out.println("Criado: " + dataCreate.format(fm1));
//		LocalDate dataExpired = dataCreate.plusMonths(1);
//		System.out.println("Expira: " + dataExpired.format(fm1));

		LocalDate d07 = d03.plusDays(30);
		System.out.println(d07);
	}

}
