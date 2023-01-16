package com.ensim.info.TP1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
public class AppSpringJava {

    public static void main(String[] args) throws LimiteVisiteurException {
        //		SpringApplication.run(Tp1Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IZooService zooService = (IZooService) context.getBean(IZooService.class);

        System.out.println("Hello welcome in my zoo");
        for (int i = 0; i < 5; i++) {
            zooService.nouveauVisiteur();
        }

        System.out.println(zooService.getVisiteurs());
    }
}
