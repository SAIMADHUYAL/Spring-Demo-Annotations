package com.saimadhu.springAnnotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		//Read the config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Get the beans from the config file
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//Call the methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();

	}

}
