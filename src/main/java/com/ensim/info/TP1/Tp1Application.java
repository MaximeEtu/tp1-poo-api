package com.ensim.info.TP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1Application {

	private static Zoo zoo;


	public static void main(String[] args) throws LimiteVisiteurException {
//		SpringApplication.run(Tp1Application.class, args);

		zoo = new Zoo(15);
		zoo.nouveauVisiteur();
	}

}
