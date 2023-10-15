package abstractfactory.factories;

import abstractfactory.customer.Customer;
import abstractfactory.customer.EnterpriseCustomer;
import abstractfactory.vehicle.EnterpriseCar;
import abstractfactory.vehicle.Vehicle;

public class EnterpriseCustomerVehicleFactory 
	implements CustomerVehicleFactory{

	@Override
	public Customer createCustomer(String name) {
		return new EnterpriseCustomer(name);
	}

	@Override
	public Vehicle createVehicle(String name, String customerName) {
		Customer customer = this.createCustomer(customerName);

		return new EnterpriseCar(name, customer);
	}
}
