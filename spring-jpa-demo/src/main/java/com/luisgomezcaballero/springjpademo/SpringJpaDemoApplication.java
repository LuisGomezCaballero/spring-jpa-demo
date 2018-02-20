package com.luisgomezcaballero.springjpademo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(MyTableRepository repository) {
		return (args) -> {
			repository.save(new MyTable((long) 1, "myString1", new Date(), (float) 1));
			repository.save(new MyTable((long) 2, "myString2", new Date(), (float) 2));

			System.out.println("findAll():");
			for (MyTable myTable : repository.findAll()) {
				System.out.println(myTable.toString());
			}
			System.out.println();

			MyTable myTable = repository.findOne(1L);
			System.out.println("findOne(1L):");
			System.out.println(myTable.toString());
			System.out.println();
		};
	}
}
