package com.saimadhu.springAnnotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//Read the Spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class); 
		
		
		
		//Get the beans from the config file
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//Call the methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();

	}

}
