package com.feltap.definition;

public interface ServiceB<T> {
	
	public ServiceA<T> getServiceA();

	public void setServiceA(ServiceA<T> serviceA);

	public T multAdd(T numberA, T numberB, T numberC);

	public T mult(T numberA, T numberB);

}
