package com.gitaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitactionApplication.class, args);
	}

	@GetMapping
	public String welcomeMsg() {
		return "welcome to spring boot application !";
	}

}
