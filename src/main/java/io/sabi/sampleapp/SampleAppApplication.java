package io.sabi.sampleapp;

import io.github.vandeli19.service.Saying;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleAppApplication  {
	@Autowired
	private Saying saying;

	public static void main(String[] args) {
		SpringApplication.run(SampleAppApplication.class, args);
	}


	@Bean
	public ApplicationRunner applicationRunner(SabiProcess sabiProcess) {
		String message = saying.sayHello();
		String print = message + " || "+sabiProcess.connectSabi();
		return args -> System.out.println(print);
	}


}
