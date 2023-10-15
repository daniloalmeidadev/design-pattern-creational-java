package abstractfactory.factories;

import abstractfactory.customer.Customer;
import abstractfactory.customer.IndividualCustomer;
import abstractfactory.vehicle.IndividualCar;
import abstractfactory.vehicle.Vehicle;

public class IndividualCustomerVehicleFactory 
	implements CustomerVehicleFactory {

	@Override
	public Customer createCustomer(String name) {
		return new IndividualCustomer(name);
	}

	@Override
	public Vehicle createVehicle(String name, String customerName) {
		Customer customer = this.createCustomer(customerName);

		return new IndividualCar(name, customer);
	}
}
