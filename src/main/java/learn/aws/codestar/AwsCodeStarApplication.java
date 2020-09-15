package learn.aws.codestar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("hello-code-star")
public class AwsCodeStarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodeStarApplication.class, args);
	}

	@GetMapping
	public String sayHello() {
		return "Hello AWS Code star!";
	}

}
