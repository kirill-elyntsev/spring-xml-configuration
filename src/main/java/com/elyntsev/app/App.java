package com.elyntsev.app;

import com.elyntsev.app.service.InputDataService;
import com.elyntsev.app.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = context.getBean(PersonService.class);
//        Person ivan = service.getByName("Ivan");
//        System.out.println("ivan = " + ivan);


        InputDataService inputDataService = context.getBean(InputDataService.class);
        inputDataService.readInputData();

    }
}
