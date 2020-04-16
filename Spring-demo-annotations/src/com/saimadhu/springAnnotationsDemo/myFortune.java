package com.saimadhu.springAnnotationsDemo;

import org.springframework.stereotype.Component;

@Component
public class myFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "This is myFortune Class";
	}

}
