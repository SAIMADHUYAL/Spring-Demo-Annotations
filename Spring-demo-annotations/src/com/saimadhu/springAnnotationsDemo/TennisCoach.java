package com.saimadhu.springAnnotationsDemo;

import org.springframework.stereotype.Component;

@Component("simpleBean")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Daily Workouts";
	}

}
