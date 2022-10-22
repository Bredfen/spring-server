package it.mirea.springserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("it.mirea.repo.*")

@SpringBootApplication
public class SpringserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringserverApplication.class, args);
	}

}
