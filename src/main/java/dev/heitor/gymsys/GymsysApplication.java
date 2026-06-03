package dev.heitor.gymsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("dev.heitor.gymsys")
@EnableJpaRepositories("dev.heitor.gymsys")
public class GymsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymsysApplication.class, args);
	}

}
