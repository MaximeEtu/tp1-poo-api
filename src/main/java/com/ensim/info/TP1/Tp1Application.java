package com.ensim.info.TP1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) throws LimiteVisiteurException {
		//		SpringApplication.run(Tp1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");


		IZooService zooService = (IZooService) context.getBean("ZooService");

		System.out.println("Hello welcome in my zoo");
		for (int i = 0; i < 5; i++) {
			zooService.nouveauVisiteur();
		}

		System.out.println(zooService.getVisiteurs());
	}
}


