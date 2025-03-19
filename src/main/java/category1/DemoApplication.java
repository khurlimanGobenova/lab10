package category1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String profile = System.getenv("SPRING_PROFILES_ACTIVE");
		if (profile != null) {
			System.setProperty("spring.profiles.active", profile);
		}
		SpringApplication.run(DemoApplication.class, args);
	}
}