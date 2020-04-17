package com.saimadhu.springAnnotationsDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create a String Array
	
	private String[] data= {
		"This is block-1",
		"This is block-2",
		"This is block-3"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// Pick a random number
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
