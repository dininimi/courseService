package lk.sathra.courseService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CourseServiceApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
