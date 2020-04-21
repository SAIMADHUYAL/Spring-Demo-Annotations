package com.saimadhu.springAnnotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//Read the Spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class); 
		
		
		
		//Get the beans from the config file
		
		Coach beanLifeCycle = context.getBean("beanLifeCycleAnnotationMethods",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//Call the methods
		
		System.out.println(beanLifeCycle.getDailyWorkout());
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(beanLifeCycle.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();

	}

}
