package com.saimadhu.springAnnotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	//Define Field Injection 
	//Configure @Autowired
	@Autowired
	@Qualifier("happyFortuneService")
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
	
	public TennisCoach() {
		System.out.println(">>> This is Default Constructor <<<");
	}
	
	//Defining the setter method for Setter Method injection
	//Configure with the @Autowired annotation
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>> This is inside setFortuneService Method <<<");
//		this.fortuneService = fortuneService;
//	}
//	
	//Defining the constructor for the Construction injection
	//Configure with the @Autowired annotation
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	//Defining Method injection
	//configure any method with @Autowired for injection
//	@Autowired
//	public void thisIsMyMethod(FortuneService fortuneService) {
//		System.out.println("<<< This is inside any method >>>");
//		this.fortuneService = fortuneService;
//	}
	

}
