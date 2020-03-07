import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomStream {

public static void main(String[] args) {
		
		//Random random = new Random();
		SecureRandom random = new SecureRandom();
		
		long secureRandomDuration = getDurationWithSecureRandom(new SecureRandom());
		long randomDuration = getDurationWithRandom(new Random());
		
		System.out.println("SecureRandom Duration: " + secureRandomDuration);
		System.out.println("Random Duration: " + randomDuration);
		
		System.out.println(" Duration difference: " + Math.abs(secureRandomDuration-randomDuration));
	}

	public static long getDurationWithSecureRandom(SecureRandom random) {
		System.out.printf("%-6s%s%n", "Face", "Frequency");
		
		Instant startinstant = Instant.now();

		random.ints(60_000_000, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
		
		Instant endinstant = Instant.now();
		
		Duration duration = Duration.between(startinstant, endinstant);
		return duration.toMillis();
	}
	
	public static long getDurationWithRandom(Random random) {
		System.out.printf("%-6s%s%n", "Face", "Frequency");
		
		Instant startinstant = Instant.now();

		random.ints(60_000_000, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
		
		Instant endinstant = Instant.now();
		
		Duration duration = Duration.between(startinstant, endinstant);
		return duration.toMillis();
	}
}