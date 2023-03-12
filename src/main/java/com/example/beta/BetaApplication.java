package com.example.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class BetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaApplication.class, args);
	}

}
