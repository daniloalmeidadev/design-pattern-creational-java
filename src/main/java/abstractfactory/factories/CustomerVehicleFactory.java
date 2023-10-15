package abstractfactory.factories;

import abstractfactory.customer.Customer;
import abstractfactory.vehicle.Vehicle;

public interface CustomerVehicleFactory {
	Customer createCustomer(String name);
	Vehicle createVehicle(String name, String customerName);
}
