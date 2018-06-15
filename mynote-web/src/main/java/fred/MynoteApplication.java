package fred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "fred")
@SpringBootApplication
public class MynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MynoteApplication.class, args);
	}
}
