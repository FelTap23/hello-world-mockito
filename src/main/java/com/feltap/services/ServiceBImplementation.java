package com.feltap.services;

import com.feltap.definition.ServiceA;
import com.feltap.definition.ServiceB;

public class ServiceBImplementation implements ServiceB<Integer>{

	
	private ServiceA<Integer> serviceA;
	
	public ServiceBImplementation(ServiceA<Integer> serviceA) {
		this.serviceA = serviceA;
	}
	
	
	
	@Override
	public ServiceA<Integer> getServiceA() {
		return serviceA;
	}

	@Override
	public void setServiceA(ServiceA<Integer> serviceA) {
		this.serviceA = serviceA;
	}

	@Override
	public Integer multAdd(Integer numberA, Integer numberB, Integer numberC) {
		
		return serviceA.add(numberA, numberB) * numberC;
	}



	@Override
	public Integer mult(Integer numberA, Integer numberB) {

		return numberA * numberB;
	}

}
