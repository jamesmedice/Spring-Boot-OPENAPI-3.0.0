package com.tiago.medici.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {
		new SpringApplication(Application.class).run(args);
	}

}
