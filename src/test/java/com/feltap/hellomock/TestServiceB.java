package com.feltap.hellomock;


import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


import com.feltap.definition.ServiceA;
import com.feltap.definition.ServiceB;
import com.feltap.services.ServiceAImplementation;
import com.feltap.services.ServiceBImplementation;


public class TestServiceB {
	
	@Test
	public void testMult() {
		ServiceB<Integer> serviceB = new ServiceBImplementation(new ServiceAImplementation());
		int result = serviceB.mult(2, 3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testMultAdd() {
		
		ServiceA<Integer> serviceA = Mockito.mock(ServiceAImplementation.class);
		when(serviceA.add(2, 3)).thenReturn(5);
		//Mockito is simulating the result of the above operation, The ServiceAImplementation.add
		ServiceB<Integer> serviceB = new ServiceBImplementation(serviceA);
		int result = serviceB.multAdd(2, 3, 2);
		Assert.assertEquals(10, result);
	}
}
