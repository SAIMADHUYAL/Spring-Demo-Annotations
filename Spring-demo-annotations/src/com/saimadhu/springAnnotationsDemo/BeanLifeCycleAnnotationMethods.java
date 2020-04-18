package com.saimadhu.springAnnotationsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class BeanLifeCycleAnnotationMethods implements Coach {

	//Define Field Injection 
		//Configure @Autowired
		@Autowired
		
		//Qualifier Annotation defines which implementation should we use
		@Qualifier("randomFortuneService")
		private FortuneService fortuneService;
		@Override
		public String getDailyWorkout() {
			// TODO Auto-generated method stub
			return "Practice Daily Workouts";
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return fortuneService.getFortune();
		}
		
		public BeanLifeCycleAnnotationMethods() {
			// TODO Auto-generated constructor stub
			System.out.println(">>> This is Bean LifeCycle Annotation Method Default Constructor <<<");
		}
		
		//Define my init method
		@PostConstruct
		public void onStart() {
			System.out.println(">>> BeanLifeCycleAnnotationMethod: inside of onStart()<<<");
		}
		//Define destroy method
		@PreDestroy
		public void onDestroy() {
			System.out.println(">>> BeanLifeCycleAnnotationMethod: inside of onDestroy() <<< ");
		}
}
