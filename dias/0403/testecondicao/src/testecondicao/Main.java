package testecondicao;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
//		for(int i = 0; i < 1000; i++) {
//			DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//			System.out.println(LocalDateTime.now().format(fm1));
//			try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//		}
		Instant d01 = Instant.now();
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy").withZone(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(fm1.format(d01));
		Instant d02 = d01.plus(1, ChronoUnit.DAYS);
		System.out.println(fm1.format(d02));
	}
	
}
