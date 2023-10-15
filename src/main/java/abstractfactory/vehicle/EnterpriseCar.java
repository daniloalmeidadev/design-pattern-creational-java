package abstractfactory.vehicle;

import abstractfactory.customer.Customer;

public class EnterpriseCar implements Vehicle {

	private String name;
	private Customer customer;
	
	public EnterpriseCar(String name, Customer customer) {
		this.name = name;
		this.customer = customer;
	}
	
	@Override
	public void pickUp() {
		System.out.println(name + " está buscando " +
				customer.name());
	}
}
