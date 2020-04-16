package com.saimadhu.springAnnotationsDemo;

import org.springframework.stereotype.Component;


public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Dayy";
	}

}
	