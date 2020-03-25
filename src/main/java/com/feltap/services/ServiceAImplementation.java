package com.feltap.services;

import com.feltap.definition.ServiceA;

public class ServiceAImplementation implements ServiceA<Integer> {
	
	
	
	
	@Override
	public Integer add(Integer numberA, Integer numberB) {
		return numberA + numberB + 1;
	}
}
