package timezone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Duration;

public class Main1 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now(); // now = pegar a data de hoje!
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now(); // now = pegar a data/hora de hoje!
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now(); // 
		System.out.println("d03 = " + d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //
		System.out.println("d04 = " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T12:22:20");
		System.out.println("d05 = " + d05);
		//
		
		Duration d08;
	}

}
