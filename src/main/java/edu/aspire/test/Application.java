package edu.aspire.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.aspire.config")
public class Application { //bootstrap class
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
