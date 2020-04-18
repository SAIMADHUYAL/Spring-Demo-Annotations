package com.saimadhu.springAnnotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		//Read the config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Get the beans from the config file
		
		Coach theCoach = context.getBean("beanLifeCycleAnnotationMethods",Coach.class);
		
		//Call the methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();

	}

}
