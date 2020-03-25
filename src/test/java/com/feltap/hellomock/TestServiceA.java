package com.feltap.hellomock;


import org.junit.Assert;
import org.junit.Test;

import com.feltap.definition.ServiceA;
import com.feltap.services.ServiceAImplementation;

public class TestServiceA {
	
	
	@Test
	public void testAdd() {
		Integer numberA = 2;
		Integer numberB = 2;
		ServiceA<Integer> service = new ServiceAImplementation();
		int result = service.add(numberA, numberB);
		Assert.assertEquals(4, result);		
	}
	
}
