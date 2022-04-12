package restapi.ex.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8080/swagger-ui.html 접속한 후 API 생성 확인

@SpringBootApplication
public class ExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}

}
